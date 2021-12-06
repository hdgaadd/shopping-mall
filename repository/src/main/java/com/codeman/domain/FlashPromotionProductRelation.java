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
public class FlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long flashPromotionId;

    private Long flashPromotionSessionId;

    private Long productId;

    private BigDecimal price;

    private Integer count;

    private Integer memberLimit;


}
