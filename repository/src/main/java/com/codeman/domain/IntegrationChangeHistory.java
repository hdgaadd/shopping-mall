package com.codeman.domain;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class IntegrationChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long memberId;

    private Integer changeType;

    private Integer changeCount;

    private LocalDateTime createTime;


    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "IntegrationChangeHistory{" +
        "memberId=" + memberId +
        ", changeType=" + changeType +
        ", changeCount=" + changeCount +
        ", createTime=" + createTime +
        "}";
    }
}
