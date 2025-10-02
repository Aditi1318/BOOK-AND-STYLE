package com.zosh.payload.dto;

import java.time.LocalDateTime;

public class ReviewDTO {

    private Long id;
    private Long property;
    private Long reviewer;
    private String reviewText;
    private Integer rating;
    private LocalDateTime createdAt;

    // No-args constructor
    public ReviewDTO() {
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

    public Long getReviewer() {
        return reviewer;
    }

    public void setReviewer(Long reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
