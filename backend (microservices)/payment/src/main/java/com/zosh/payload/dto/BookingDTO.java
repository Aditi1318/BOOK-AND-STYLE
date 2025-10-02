package com.zosh.payload.dto;

import com.zosh.domain.BookingStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class BookingDTO {

    private Long id;
    private Long salonId;
    private Long customerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> servicesIds;
    private BookingStatus status;
    private int totalPrice;

    // No-args constructor
    public BookingDTO() {}

    // All-args constructor
    public BookingDTO(Long id, Long salonId, Long customerId, LocalDateTime startTime, LocalDateTime endTime,
                      Set<Long> servicesIds, BookingStatus status, int totalPrice) {
        this.id = id;
        this.salonId = salonId;
        this.customerId = customerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.servicesIds = servicesIds;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalonId() {
        return salonId;
    }

    public void setSalonId(Long salonId) {
        this.salonId = salonId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Set<Long> getServicesIds() {
        return servicesIds;
    }

    public void setServicesIds(Set<Long> servicesIds) {
        this.servicesIds = servicesIds;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    // toString method

    @Override
    public String toString() {
        return "BookingDTO{" +
                "id=" + id +
                ", salonId=" + salonId +
                ", customerId=" + customerId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", servicesIds=" + servicesIds +
                ", status=" + status +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
