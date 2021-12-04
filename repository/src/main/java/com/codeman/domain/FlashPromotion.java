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
public class FlashPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "FlashPromotion{" +
        "id=" + id +
        ", title=" + title +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
