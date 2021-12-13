package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Cart;
import com.codeman.mapper.CartMapper;
import com.codeman.service.CartItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:29:14
*/
@Service
public class CartItemServiceImpl implements CartItemService {
    @Resource
    private CartMapper cartMapper;

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
}
