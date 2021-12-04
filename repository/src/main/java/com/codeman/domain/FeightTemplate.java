package com.codeman.domain;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class FeightTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer chargeType;

    private BigDecimal firstWeight;

    private BigDecimal firstFee;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    @Override
    public String toString() {
        return "FeightTemplate{" +
        "id=" + id +
        ", name=" + name +
        ", chargeType=" + chargeType +
        ", firstWeight=" + firstWeight +
        ", firstFee=" + firstFee +
        "}";
    }
}
