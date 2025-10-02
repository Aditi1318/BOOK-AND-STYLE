package com.zosh.payload.dto;

public class NotificationDTO {

    private Long id;
    private String type;
    private Boolean isRead = false;
    private String description;
    private Long userId;
    private Long bookingId;
    private Long salonId;
    private BookingDTO booking;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, String type, Boolean isRead, String description,
                           Long userId, Long bookingId, Long salonId, BookingDTO booking) {
        this.id = id;
        this.type = type;
        this.isRead = isRead;
        this.description = description;
        this.userId = userId;
        this.bookingId = bookingId;
        this.salonId = salonId;
        this.booking = booking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public BookingDTO getBooking() {
        return booking;
    }

    public void setBooking(BookingDTO booking) {
        this.booking = booking;
    }
}
