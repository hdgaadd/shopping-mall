package com.codeman.controller;

import com.codeman.domain.Cart;
import com.codeman.service.CartItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:29:14
*/
@Api(tags = "购物车管理")
@RestController
@RequestMapping("/cart")
public class CartItemController {
    @Resource
    private CartItemService cartService;

    // 主键得去除
    @ApiOperation("添加商品到购物车")
    @GetMapping("/addCart")
    public CommonResult addCart(Cart cart) {
        int count = cartService.addCart(cart);
        return count >=1 ? CommonResult.success(count) : CommonResult.failed(count);
    }

    // listCart() 获取用户的购物车列表

    // updateQuantity(Long id, Integer quantity) 修改购物车中商品的数量

    // getCartProduct(Long productId) 获取某个商品的规格，用于重选规格

    // updateAttr(Cart cart) 修改购物车中商品的属性

    // delete(List<Long> productIds) 删除购物车中的某些商品

    // clear() 清空用户购物车，把购物车数据的status设置为失效
}
