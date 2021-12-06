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
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String icon;

    private Long productCategoryId;

    private Long productAttributeCategoryId;

    private Long brandId;

    private Long feightTemplateId;

    private BigDecimal price;

    private BigDecimal weight;

    private Integer sort;

    private Integer sale;

    private Integer status;


}
