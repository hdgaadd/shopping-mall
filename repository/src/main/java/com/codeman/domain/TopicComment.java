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
public class TopicComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String memberName;

    private String memberIcon;

    private String content;

    private Long topicId;

    private Integer showStatus;

    private LocalDateTime createTime;


}
