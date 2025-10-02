package com.zosh.payload.request;

import java.util.List;

public class CreateReviewRequest {

    private String reviewText;
    private double reviewRating;
    private List<String> productImages;

    // Default constructor
    public CreateReviewRequest() {}

    // Getters and Setters

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public double getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(double reviewRating) {
        this.reviewRating = reviewRating;
    }

    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }
}
