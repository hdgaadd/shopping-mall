package com.codeman.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author hdgaadd
 * @since 2022-01-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductLadder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private Integer count;

    private BigDecimal discount;

    private BigDecimal price;


}
