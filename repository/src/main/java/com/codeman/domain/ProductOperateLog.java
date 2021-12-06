package com.codeman.domain;

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
public class ProductOperateLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long productId;

    private String operateMan;

    private LocalDateTime createTime;


}
