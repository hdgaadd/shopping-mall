package com.codeman.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商品会员价格表
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class PmsMemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    private String memberLevelName;


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

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @Override
    public String toString() {
        return "PmsMemberPrice{" +
        "id=" + id +
        ", productId=" + productId +
        ", memberLevelId=" + memberLevelId +
        ", memberPrice=" + memberPrice +
        ", memberLevelName=" + memberLevelName +
        "}";
    }
}
