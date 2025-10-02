package com.zosh.modal;

import com.zosh.domain.PaymentMethod;
import com.zosh.domain.PaymentOrderStatus;

public class PaymentOrder {

    private Long id;
    private Long amount;
    private PaymentOrderStatus status;
    private PaymentMethod paymentMethod;
    private String paymentLinkId;
    private Long userId;
    private Long bookingId;

    // No-args constructor
    public PaymentOrder() {
    }

    // All-args constructor
    public PaymentOrder(Long id, Long amount, PaymentOrderStatus status, PaymentMethod paymentMethod,
                        String paymentLinkId, Long userId, Long bookingId) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentLinkId = paymentLinkId;
        this.userId = userId;
        this.bookingId = bookingId;
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
}
