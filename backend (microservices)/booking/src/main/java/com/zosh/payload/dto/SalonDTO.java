package com.zosh.payload.dto;

import java.time.LocalTime;
import java.util.List;

public class SalonDTO {

        private Long id;
        private String name;
        private String address;
        private String phoneNumber;
        private String email;
        private String city;
        private boolean isOpen;
        private boolean homeService;
        private boolean active;
        private Long ownerId;
        private LocalTime openTime;
        private LocalTime closeTime;
        private List<String> images;

        // No-args constructor
        public SalonDTO() {
        }

        // All-args constructor
        public SalonDTO(Long id, String name, String address, String phoneNumber, String email, String city,
                        boolean isOpen, boolean homeService, boolean active, Long ownerId,
                        LocalTime openTime, LocalTime closeTime, List<String> images) {
                this.id = id;
                this.name = name;
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.email = email;
                this.city = city;
                this.isOpen = isOpen;
                this.homeService = homeService;
                this.active = active;
                this.ownerId = ownerId;
                this.openTime = openTime;
                this.closeTime = closeTime;
                this.images = images;
        }

        // Getters and Setters

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

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public boolean isOpen() {
                return isOpen;
        }

        public void setOpen(boolean open) {
                isOpen = open;
        }

        public boolean isHomeService() {
                return homeService;
        }

        public void setHomeService(boolean homeService) {
                this.homeService = homeService;
        }

        public boolean isActive() {
                return active;
        }

        public void setActive(boolean active) {
                this.active = active;
        }

        public Long getOwnerId() {
                return ownerId;
        }

        public void setOwnerId(Long ownerId) {
                this.ownerId = ownerId;
        }

        public LocalTime getOpenTime() {
                return openTime;
        }

        public void setOpenTime(LocalTime openTime) {
                this.openTime = openTime;
        }

        public LocalTime getCloseTime() {
                return closeTime;
        }

        public void setCloseTime(LocalTime closeTime) {
                this.closeTime = closeTime;
        }

        public List<String> getImages() {
                return images;
        }

        public void setImages(List<String> images) {
                this.images = images;
        }

        @Override
        public String toString() {
                return "SalonDTO{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", email='" + email + '\'' +
                        ", city='" + city + '\'' +
                        ", isOpen=" + isOpen +
                        ", homeService=" + homeService +
                        ", active=" + active +
                        ", ownerId=" + ownerId +
                        ", openTime=" + openTime +
                        ", closeTime=" + closeTime +
                        ", images=" + images +
                        '}';
        }
}
