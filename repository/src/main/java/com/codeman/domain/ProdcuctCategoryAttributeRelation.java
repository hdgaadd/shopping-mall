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
public class ProdcuctCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productCategoryId;

    private Long attributeId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Override
    public String toString() {
        return "ProdcuctCategoryAttributeRelation{" +
        "id=" + id +
        ", productCategoryId=" + productCategoryId +
        ", attributeId=" + attributeId +
        "}";
    }
}
