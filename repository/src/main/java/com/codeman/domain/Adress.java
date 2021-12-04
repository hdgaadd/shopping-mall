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
public class Adress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long memberId;

    private Integer defaultSendStatus;

    private Integer defaultReceiveStatus;

    private String detailAdress;


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

    public Integer getDefaultSendStatus() {
        return defaultSendStatus;
    }

    public void setDefaultSendStatus(Integer defaultSendStatus) {
        this.defaultSendStatus = defaultSendStatus;
    }

    public Integer getDefaultReceiveStatus() {
        return defaultReceiveStatus;
    }

    public void setDefaultReceiveStatus(Integer defaultReceiveStatus) {
        this.defaultReceiveStatus = defaultReceiveStatus;
    }

    public String getDetailAdress() {
        return detailAdress;
    }

    public void setDetailAdress(String detailAdress) {
        this.detailAdress = detailAdress;
    }

    @Override
    public String toString() {
        return "Adress{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", defaultSendStatus=" + defaultSendStatus +
        ", defaultReceiveStatus=" + defaultReceiveStatus +
        ", detailAdress=" + detailAdress +
        "}";
    }
}
