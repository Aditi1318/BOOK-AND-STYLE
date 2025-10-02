package com.zosh.modal;

public class SalonReport {

    private Long salonId;
    private String salonName;
    private Double totalEarnings;
    private Integer totalBookings;
    private Integer cancelledBookings;
    private Double totalRefund;

    // No-args constructor
    public SalonReport() {
    }

    // All-args constructor
    public SalonReport(Long salonId, String salonName, Double totalEarnings, Integer totalBookings,
                       Integer cancelledBookings, Double totalRefund) {
        this.salonId = salonId;
        this.salonName = salonName;
        this.totalEarnings = totalEarnings;
        this.totalBookings = totalBookings;
        this.cancelledBookings = cancelledBookings;
        this.totalRefund = totalRefund;
    }

    // Getters and Setters
    public Long getSalonId() {
        return salonId;
    }

    public void setSalonId(Long salonId) {
        this.salonId = salonId;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public Double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(Double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public Integer getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(Integer totalBookings) {
        this.totalBookings = totalBookings;
    }

    public Integer getCancelledBookings() {
        return cancelledBookings;
    }

    public void setCancelledBookings(Integer cancelledBookings) {
        this.cancelledBookings = cancelledBookings;
    }

    public Double getTotalRefund() {
        return totalRefund;
    }

    public void setTotalRefund(Double totalRefund) {
        this.totalRefund = totalRefund;
    }
}
