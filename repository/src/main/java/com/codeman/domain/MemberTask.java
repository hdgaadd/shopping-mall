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
public class MemberTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer integration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Override
    public String toString() {
        return "MemberTask{" +
        "id=" + id +
        ", name=" + name +
        ", integration=" + integration +
        "}";
    }
}
