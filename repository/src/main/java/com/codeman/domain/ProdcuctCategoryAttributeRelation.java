package com.codeman.domain;

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
public class ProdcuctCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productCategoryId;

    private Long attributeId;


}
