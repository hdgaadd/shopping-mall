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
public class OrdrerSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer normalOverTime;

    private Integer flashOverTime;

    private Integer confirmTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNormalOverTime() {
        return normalOverTime;
    }

    public void setNormalOverTime(Integer normalOverTime) {
        this.normalOverTime = normalOverTime;
    }

    public Integer getFlashOverTime() {
        return flashOverTime;
    }

    public void setFlashOverTime(Integer flashOverTime) {
        this.flashOverTime = flashOverTime;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Override
    public String toString() {
        return "OrdrerSetting{" +
        "id=" + id +
        ", normalOverTime=" + normalOverTime +
        ", flashOverTime=" + flashOverTime +
        ", confirmTime=" + confirmTime +
        "}";
    }
}
