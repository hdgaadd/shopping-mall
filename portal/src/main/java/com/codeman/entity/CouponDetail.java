package com.codeman.entity;

import com.codeman.domain.Coupon;
import com.codeman.domain.CouponProductCategoryRelation;
import com.codeman.domain.CouponProductRelation;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11/14:32
 */
public class CouponDetail {

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
