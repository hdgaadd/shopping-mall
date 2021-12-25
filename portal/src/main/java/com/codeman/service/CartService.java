package com.codeman.service;

import com.codeman.domain.Cart;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hdgaadd
 * Created on 2021/12/25
*/
public interface CartService {
    /**
     * 添加商品到购物车
     * @param cart
     * @return
     */
    @Transactional
    int addCart(Cart cart);
}