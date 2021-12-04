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
public class CouponProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long couponId;

    private Long productId;


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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "CouponProductRelation{" +
        "id=" + id +
        ", couponId=" + couponId +
        ", productId=" + productId +
        "}";
    }
}
