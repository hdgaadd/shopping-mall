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
public class OrderMain implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer code;

    private Long memberId;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private Integer couponAmount;

    private Integer payType;

    private Integer status;

    private String note;


}
