package com.zosh.payload.dto;

public class CategoryDTO {

    private Long id;
    private String name;
    private String image;

    // No-args constructor
    public CategoryDTO() {
    }

    // All-args constructor
    public CategoryDTO(Long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    // Getters and setters
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // toString method
    @Override
    public String toString() {
        return "CategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
