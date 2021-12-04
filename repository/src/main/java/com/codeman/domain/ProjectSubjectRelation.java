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
public class ProjectSubjectRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long projecId;

    private Long subjectId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjecId() {
        return projecId;
    }

    public void setProjecId(Long projecId) {
        this.projecId = projecId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "ProjectSubjectRelation{" +
        "id=" + id +
        ", projecId=" + projecId +
        ", subjectId=" + subjectId +
        "}";
    }
}
