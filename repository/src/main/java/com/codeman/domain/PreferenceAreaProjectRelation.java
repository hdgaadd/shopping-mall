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
public class PreferenceAreaProjectRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Long preferenceId;


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

    public Long getPreferenceId() {
        return preferenceId;
    }

    public void setPreferenceId(Long preferenceId) {
        this.preferenceId = preferenceId;
    }

    @Override
    public String toString() {
        return "PreferenceAreaProjectRelation{" +
        "id=" + id +
        ", productId=" + productId +
        ", preferenceId=" + preferenceId +
        "}";
    }
}
