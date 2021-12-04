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
public class FlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long flashPromotionId;

    private Long flashPromotionSessionId;

    private Long productId;

    private BigDecimal price;

    private Integer count;

    private Integer memberLimit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    @Override
    public String toString() {
        return "FlashPromotionProductRelation{" +
        "id=" + id +
        ", flashPromotionId=" + flashPromotionId +
        ", flashPromotionSessionId=" + flashPromotionSessionId +
        ", productId=" + productId +
        ", price=" + price +
        ", count=" + count +
        ", memberLimit=" + memberLimit +
        "}";
    }
}
