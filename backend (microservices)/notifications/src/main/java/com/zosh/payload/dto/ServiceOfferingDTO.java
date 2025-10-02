package com.zosh.payload.dto;

public class ServiceOfferingDTO {

    private Long id;
    private String name;
    private String description;
    private int price;
    private int duration;
    private Long salon;
    private boolean available;
    private Long category;
    private String image;

    public ServiceOfferingDTO() {
    }

    public ServiceOfferingDTO(Long id, String name, String description, int price, int duration,
                              Long salon, boolean available, Long category, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.salon = salon;
        this.available = available;
        this.category = category;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getSalon() {
        return salon;
    }

    public void setSalon(Long salon) {
        this.salon = salon;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
}
