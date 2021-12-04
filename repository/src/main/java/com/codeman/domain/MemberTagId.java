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
public class MemberTagId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private Long tagId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "MemberTagId{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", tagId=" + tagId +
        "}";
    }
}
