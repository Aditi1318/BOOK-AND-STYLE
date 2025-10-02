package com.zosh.payload.dto;

import java.time.LocalDateTime;

public class ReviewDTO {

    private Long id;
    private Long property;
    private UserDTO user;
    private SalonDTO salon;
    private String reviewText;
    private double rating;
    private LocalDateTime createdAt;

    // No-args constructor
    public ReviewDTO() {
    }

    // All-args constructor
    public ReviewDTO(Long id, Long property, UserDTO user, SalonDTO salon, String reviewText, double rating, LocalDateTime createdAt) {
        this.id = id;
        this.property = property;
        this.user = user;
        this.salon = salon;
        this.reviewText = reviewText;
        this.rating = rating;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProperty() {
        return property;
    }

    public void setProperty(Long property) {
        this.property = property;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public SalonDTO getSalon() {
        return salon;
    }

    public void setSalon(SalonDTO salon) {
        this.salon = salon;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // toString method
    @Override
    public String toString() {
        return "ReviewDTO{" +
                "id=" + id +
                ", property=" + property +
                ", user=" + user +
                ", salon=" + salon +
                ", reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                '}';
    }
}
