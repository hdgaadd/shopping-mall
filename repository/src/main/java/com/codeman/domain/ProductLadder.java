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
public class ProductLadder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private Integer count;

    private BigDecimal discount;

    private BigDecimal price;


}
