package com.zosh.modal;

import com.zosh.domain.PaymentMethod;
import com.zosh.domain.PaymentOrderStatus;

import jakarta.persistence.*;

@Entity
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;

    private PaymentOrderStatus status = PaymentOrderStatus.PENDING;

    private PaymentMethod paymentMethod;

    private String paymentLinkId;

    private Long userId;

    private Long bookingId;

    @Column(nullable = false)
    private Long salonId;

    // No-args constructor
    public PaymentOrder() {
    }

    // All-args constructor
    public PaymentOrder(Long id, Long amount, PaymentOrderStatus status, PaymentMethod paymentMethod,
                        String paymentLinkId, Long userId, Long bookingId, Long salonId) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentLinkId = paymentLinkId;
        this.userId = userId;
        this.bookingId = bookingId;
        this.salonId = salonId;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public PaymentOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentOrderStatus status) {
        this.status = status;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentLinkId() {
        return paymentLinkId;
    }

    public void setPaymentLinkId(String paymentLinkId) {
        this.paymentLinkId = paymentLinkId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getSalonId() {
        return salonId;
    }

    public void setSalonId(Long salonId) {
        this.salonId = salonId;
    }

    // toString method

    @Override
    public String toString() {
        return "PaymentOrder{" +
                "id=" + id +
                ", amount=" + amount +
                ", status=" + status +
                ", paymentMethod=" + paymentMethod +
                ", paymentLinkId='" + paymentLinkId + '\'' +
                ", userId=" + userId +
                ", bookingId=" + bookingId +
                ", salonId=" + salonId +
                '}';
    }
}
