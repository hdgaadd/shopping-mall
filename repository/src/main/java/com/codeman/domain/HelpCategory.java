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
public class HelpCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String icon;


}
