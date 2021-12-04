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
public class SuperMemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Long memberLevelId;

    private BigDecimal price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SuperMemberPrice{" +
        "id=" + id +
        ", productId=" + productId +
        ", memberLevelId=" + memberLevelId +
        ", price=" + price +
        "}";
    }
}
