package com.codeman.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String content;

    private String icon;

    private Long categoryId;

    private Integer attendCount;

    private Integer attentitionCount;

    private Integer readCount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
