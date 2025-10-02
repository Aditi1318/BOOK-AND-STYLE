package com.zosh.payload.request;

import java.time.LocalDateTime;
import java.util.Set;

public class BookingRequest {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> serviceIds;
    private String status;

    // Default constructor
    public BookingRequest() {}

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

    public Set<Long> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(Set<Long> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
