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
public class SubjectComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String memberName;

    private String memberIcon;

    private String content;

    private Long subjectId;

    private Integer showStatus;

    private LocalDateTime createTime;


}
