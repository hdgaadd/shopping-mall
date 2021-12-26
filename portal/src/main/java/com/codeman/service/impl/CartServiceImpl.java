package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Cart;
import com.codeman.domain.Member;
import com.codeman.mapper.CartMapper;
import com.codeman.service.CartService;
import com.codeman.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/25
*/
@Service
public class CartServiceImpl implements CartService {
    @Resource
    private MemberService memberService;
    @Resource
    private CartMapper cartMapper;

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
