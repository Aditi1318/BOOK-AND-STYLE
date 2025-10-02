package com.zosh.payload.dto;

public class ServiceDTO {

    private String name;
    private String description;
    private int price;
    private int duration;
    private Long category;
    private String image;

    // No-args constructor
    public ServiceDTO() {
    }

    // All-args constructor
    public ServiceDTO(String name, String description, int price, int duration, Long category, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.category = category;
        this.image = image;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // toString method
    @Override
    public String toString() {
        return "ServiceDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", category=" + category +
                ", image='" + image + '\'' +
                '}';
    }
}
