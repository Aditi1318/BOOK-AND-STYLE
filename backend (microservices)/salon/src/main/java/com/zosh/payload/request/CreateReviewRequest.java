package com.zosh.payload.request;

import java.util.List;

public class CreateReviewRequest {

    private String reviewText;
    private double reviewRating;
    private List<String> productImages;

    // No-args constructor
    public CreateReviewRequest() {
    }

    // All-args constructor
    public CreateReviewRequest(String reviewText, double reviewRating, List<String> productImages) {
        this.reviewText = reviewText;
        this.reviewRating = reviewRating;
        this.productImages = productImages;
    }

    // Getters and setters
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

    // toString method
    @Override
    public String toString() {
        return "CreateReviewRequest{" +
                "reviewText='" + reviewText + '\'' +
                ", reviewRating=" + reviewRating +
                ", productImages=" + productImages +
                '}';
    }
}
