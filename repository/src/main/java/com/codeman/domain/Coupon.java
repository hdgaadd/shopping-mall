package com.codeman.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String type;

    private String name;

    private Integer count;

    private BigDecimal amount;

    private Integer couponLimit;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


}
