package com.codeman.service;

import com.codeman.domain.Cart;
import com.codeman.domain.Coupon;
import com.codeman.domain.CouponDetail;
import util.CommonResult;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 10:49:17
*/
public interface MemberCouponService {
    /**
     * 根据购物车获取用户所有可用优惠券
     */
    List<CouponDetail> listCart(List<Cart> carts, String tyep);

    /**
     * 领取指定优惠券
     * @param couponId
     */
    CommonResult addCoupon(Long couponId);

    /**'
     * 获取当前商品的相关优惠券
     * @return
     */
    List<Coupon> couponsByProductId(Long productId);
}