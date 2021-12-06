package com.codeman.domain;

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
public class OrdrerSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer normalOverTime;

    private Integer flashOverTime;

    private Integer confirmTime;


}
