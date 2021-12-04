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
public class ProductAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Long attributeId;


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

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Override
    public String toString() {
        return "ProductAttributeRelation{" +
        "id=" + id +
        ", productId=" + productId +
        ", attributeId=" + attributeId +
        "}";
    }
}
