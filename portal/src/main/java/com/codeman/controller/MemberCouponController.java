package com.codeman.controller;

import com.codeman.domain.Cart;
import com.codeman.domain.Coupon;
import com.codeman.domain.CouponDetail;
import com.codeman.service.CartItemService;
import com.codeman.service.MemberCouponService;
import com.codeman.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import util.CommonResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 10:49:17
 */
@Api(tags = "用户优惠券管理")
@RestController
@RequestMapping("/member")
public class MemberCouponController {
    @Resource
    private MemberCouponService memberCouponService;
    @Resource
    private MemberService memberService;
    @Resource
    private CartItemService cartItemService;

    @ApiOperation("获取用户购物车的所有优惠券")
    @GetMapping("/coupon/{type}") // type为USEALL
    public CommonResult<List<CouponDetail>> listCart(@PathVariable String type) {
        List<Cart> carts = cartItemService.getAllCart(memberService.getCurrentMember().getId(), null);
        List<CouponDetail> couponDetails = memberCouponService.listCart(carts, type);
        return CommonResult.success(couponDetails);
    }

    @ApiOperation("领取指定优惠券")
    @PostMapping("/addCoupon/{couponId}")
    public CommonResult addCoupon(@PathVariable Long couponId) {
        return memberCouponService.addCoupon(couponId);
    }

    // 获取用户优惠券领取历史记录

    // 根据用户优惠券领取历史记录表，获取用户拥有的优惠券

    @ApiOperation("获取当前商品的相关优惠券")
    @GetMapping("/couponsByProductId/{productId}")
    public CommonResult<List<Coupon>> couponsByProductId(@PathVariable Long productId) {
        List<Coupon> coupons = memberCouponService.couponsByProductId(productId);
        return CommonResult.success(coupons);
    }
}
