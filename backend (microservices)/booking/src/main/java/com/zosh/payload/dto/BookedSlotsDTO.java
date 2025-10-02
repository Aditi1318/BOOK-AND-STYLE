package com.zosh.payload.dto;

import java.time.LocalDateTime;

public class BookedSlotsDTO {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // No-args constructor
    public BookedSlotsDTO() {
    }

    // All-args constructor
    public BookedSlotsDTO(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
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
}
