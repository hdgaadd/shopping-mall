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
public class HomeAdvertise implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String icon;

    private String url;

    private Integer status;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


}
