package com.codeman.domain;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class CouponProductCategoryRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long couponId;

    private Long productCategoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Override
    public String toString() {
        return "CouponProductCategoryRelation{" +
        "id=" + id +
        ", couponId=" + couponId +
        ", productCategoryId=" + productCategoryId +
        "}";
    }
}
