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
public class IntegrationConsumeSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer count;

    private Integer couponStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Override
    public String toString() {
        return "IntegrationConsumeSetting{" +
        "id=" + id +
        ", count=" + count +
        ", couponStatus=" + couponStatus +
        "}";
    }
}
