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
public class MemberLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private LocalDateTime createTime;

    private String ip;

    private String browerType;


}
