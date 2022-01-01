package com.codeman.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2022-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long flashPromotionId;

    private Long flashPromotionSessionId;

    private Long productId;

    private BigDecimal price;

    private Integer count;

    private Integer memberLimit;


}
