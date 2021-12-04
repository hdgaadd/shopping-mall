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
public class ProductSkuStock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Integer skuCode;

    private BigDecimal price;

    private String icon;

    private Integer sale;

    private Integer sock;

    private Integer lowStock;

    private Integer lockStock;


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

    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getSock() {
        return sock;
    }

    public void setSock(Integer sock) {
        this.sock = sock;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public Integer getLockStock() {
        return lockStock;
    }

    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    @Override
    public String toString() {
        return "ProductSkuStock{" +
        "id=" + id +
        ", productId=" + productId +
        ", skuCode=" + skuCode +
        ", price=" + price +
        ", icon=" + icon +
        ", sale=" + sale +
        ", sock=" + sock +
        ", lowStock=" + lowStock +
        ", lockStock=" + lockStock +
        "}";
    }
}
