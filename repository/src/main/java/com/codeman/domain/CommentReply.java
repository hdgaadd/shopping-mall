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
public class CommentReply implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long commentId;

    private Long memberId;

    private String content;

    private LocalDateTime createTime;


}
