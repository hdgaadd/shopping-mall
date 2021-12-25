package com.codeman.controller;

import com.codeman.domain.Cart;
import com.codeman.service.CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/25
 */
@Api(tags = "购物车管理")
@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private CartService cartService;

    // 主键得去除
    @ApiOperation("添加商品到购物车")
    @GetMapping("/addCart")
    public CommonResult addCart(Cart cart) {
        int count = cartService.addCart(cart);
        return count >=1 ? CommonResult.success(count) : CommonResult.failed(count);
    }
}
