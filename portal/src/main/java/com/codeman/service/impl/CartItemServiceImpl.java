package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Cart;
import com.codeman.domain.Member;
import com.codeman.mapper.CartMapper;
import com.codeman.service.CartItemService;
import com.codeman.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:29:14
*/
@Service
public class CartItemServiceImpl implements CartItemService {
    @Resource
    private CartMapper cartMapper;
    @Resource
    private MemberService memberService;

    @Override
    public List<Cart> getAllCart(Long id, List<Long> cartId) {
        QueryWrapper<Cart> cartQueryWrapper = new QueryWrapper<>();
        cartQueryWrapper.eq("member_id", id);
        List<Cart> cartList = cartMapper.selectList(cartQueryWrapper);
        // 过滤cartList中，包含cartId的购物车
        if (cartId != null) {
            cartList = cartList.stream().filter(item -> cartId.contains(item.getId())).collect(Collectors.toList());
        }
        return cartList;
    }

    @Override
    public int addCart(Cart cart) {
        Member currentMember = memberService.getCurrentMember();
        // 查询是否有相同商品的购物车，有则购物车的商品数量+1，无则创建购物车
        Cart oldCart = isExist(currentMember, cart);
        if (oldCart != null) {
            oldCart.setQuantity(oldCart.getQuantity() + 1);
            return cartMapper.updateById(oldCart);
        } else {
            return cartMapper.insert(cart);
        }
    }

    /**
     * 查询是否有相同商品的购物车
     * @param currentMember
     * @param cart
     * @return
     */
    private Cart isExist(Member currentMember, Cart cart) {
        QueryWrapper<Cart> cartQueryWrapper = new QueryWrapper<>();
        cartQueryWrapper.eq("product_sku_id", cart.getProductSkuId()).eq("member_id", currentMember.getId());
        List<Cart> carts = cartMapper.selectList(cartQueryWrapper);
        if (!carts.isEmpty()) {
            return carts.get(0);
        }
        return null;
    }
}
