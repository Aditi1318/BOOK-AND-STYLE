package com.zosh.payload.dto;

import com.zosh.domain.BookingStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class BookingDTO {

    private Long id;
    private Long salonId;
    private SalonDTO salon;
    private Long customerId;
    private UserDTO customer;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> servicesIds;
    private Set<ServiceOfferingDTO> services;
    private BookingStatus status;
    private int totalPrice;

    // No-args constructor
    public BookingDTO() {
    }

    // Getters and setters

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

    public SalonDTO getSalon() {
        return salon;
    }

    public void setSalon(SalonDTO salon) {
        this.salon = salon;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public UserDTO getCustomer() {
        return customer;
    }

    public void setCustomer(UserDTO customer) {
        this.customer = customer;
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

    public Set<ServiceOfferingDTO> getServices() {
        return services;
    }

    public void setServices(Set<ServiceOfferingDTO> services) {
        this.services = services;
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
}
