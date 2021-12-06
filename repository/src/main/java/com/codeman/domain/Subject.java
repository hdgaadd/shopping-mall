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
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String content;

    private String icon;

    private Long categoryId;

    private Integer showStatus;

    private Integer projectCount;

    private LocalDateTime createTime;


}
