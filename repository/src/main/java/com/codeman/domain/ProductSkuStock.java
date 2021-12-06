package com.codeman.domain;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
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


}
