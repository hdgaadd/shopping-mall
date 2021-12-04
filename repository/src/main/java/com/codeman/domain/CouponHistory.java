package com.codeman.domain;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class CouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private Long couponId;

    private Long orderId;

    private LocalDateTime useTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getUseTime() {
        return useTime;
    }

    public void setUseTime(LocalDateTime useTime) {
        this.useTime = useTime;
    }

    @Override
    public String toString() {
        return "CouponHistory{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", couponId=" + couponId +
        ", orderId=" + orderId +
        ", useTime=" + useTime +
        "}";
    }
}
