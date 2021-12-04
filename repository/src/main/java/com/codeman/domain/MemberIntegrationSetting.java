package com.codeman.domain;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class MemberIntegrationSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer continueDayCount;

    private Integer count;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContinueDayCount() {
        return continueDayCount;
    }

    public void setContinueDayCount(Integer continueDayCount) {
        this.continueDayCount = continueDayCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MemberIntegrationSetting{" +
        "id=" + id +
        ", continueDayCount=" + continueDayCount +
        ", count=" + count +
        "}";
    }
}
