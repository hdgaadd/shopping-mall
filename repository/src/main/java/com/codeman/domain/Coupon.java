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
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String type;

    private String name;

    private Integer count;

    private Integer amount;

    private Integer couponLimit;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCouponLimit() {
        return couponLimit;
    }

    public void setCouponLimit(Integer couponLimit) {
        this.couponLimit = couponLimit;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Coupon{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", count=" + count +
        ", amount=" + amount +
        ", couponLimit=" + couponLimit +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
