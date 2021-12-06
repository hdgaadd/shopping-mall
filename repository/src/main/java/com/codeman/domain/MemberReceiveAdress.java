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
public class MemberReceiveAdress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private String adress;


}
