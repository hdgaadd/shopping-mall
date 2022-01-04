package com.codeman.domain;

import com.codeman.domain.Coupon;
import com.codeman.domain.CouponHistory;
import com.codeman.domain.CouponProductCategoryRelation;
import com.codeman.domain.CouponProductRelation;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11/14:32
 * @description 每一个CouponDetail代表用户的一张优惠券，其中优惠券包含了可使用的List<商品>、可使用的List<商品分类>
 */
public class CouponDetail extends CouponHistory {

    private Coupon coupons;

    private List<CouponProductRelation> couponProductRelations;

    private List<CouponProductCategoryRelation> couponProductCategoryRelations;

    public Coupon getCoupons() {
        return coupons;
    }

    public void setCoupons(Coupon coupons) {
        this.coupons = coupons;
    }

    public List<CouponProductRelation> getCouponProductRelations() {
        return couponProductRelations;
    }

    public void setCouponProductRelations(List<CouponProductRelation> couponProductRelations) {
        this.couponProductRelations = couponProductRelations;
    }

    public List<CouponProductCategoryRelation> getCouponProductCategoryRelations() {
        return couponProductCategoryRelations;
    }

    public void setCouponProductCategoryRelations(List<CouponProductCategoryRelation> couponProductCategoryRelations) {
        this.couponProductCategoryRelations = couponProductCategoryRelations;
    }
}
