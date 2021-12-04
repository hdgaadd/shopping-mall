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
public class ProductAttributeCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer attributeCount;


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

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    @Override
    public String toString() {
        return "ProductAttributeCategory{" +
        "id=" + id +
        ", name=" + name +
        ", attributeCount=" + attributeCount +
        "}";
    }
}
