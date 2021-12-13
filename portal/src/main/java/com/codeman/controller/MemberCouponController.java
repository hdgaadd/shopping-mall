package com.codeman.controller;

import com.codeman.domain.Cart;
import com.codeman.entity.CouponDetail;
import com.codeman.service.CartItemService;
import com.codeman.service.MemberCouponService;
import com.codeman.service.MemberService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.R;

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

    @GetMapping("/coupon/{type}")
    public R<List<CouponDetail>> listCart(@PathVariable String type) {
        List<Cart> carts = cartItemService.getAllCart(memberService.getCurrentMember().getId(), null);
        List<CouponDetail> couponDetails = memberCouponService.listCart(carts, type);
        return R.ok(couponDetails);
    }
}
