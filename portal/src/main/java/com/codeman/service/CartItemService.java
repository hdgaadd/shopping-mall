package com.codeman.service;

import com.codeman.domain.Cart;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:29:14
*/
public interface CartItemService {
    /**
     * 根据用户id获取所有购物车
     */
    List<Cart> getAllCart(Long id, List<Long> cartId);
    /**
     * 添加商品到购物车
     * @param cart
     * @return
     */
    @Transactional
    int addCart(Cart cart);
}