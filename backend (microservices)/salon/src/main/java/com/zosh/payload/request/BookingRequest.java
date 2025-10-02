package com.zosh.payload.request;

import java.time.LocalDateTime;
import java.util.Set;

public class BookingRequest {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> serviceIds;
    private String status;

    // No-args constructor
    public BookingRequest() {
    }

    // All-args constructor
    public BookingRequest(LocalDateTime startTime, LocalDateTime endTime, Set<Long> serviceIds, String status) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.serviceIds = serviceIds;
        this.status = status;
    }

    // Getters and setters
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

    // toString method
    @Override
    public String toString() {
        return "BookingRequest{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", serviceIds=" + serviceIds +
                ", status='" + status + '\'' +
                '}';
    }
}
