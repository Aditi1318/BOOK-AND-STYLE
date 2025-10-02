package com.zosh.modal;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "salons")
public class Salon {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 100)
        private String name;

        @ElementCollection
        @CollectionTable(name = "salon_images", joinColumns = @JoinColumn(name = "salon_id"))
        @Column(name = "image")
        private List<String> images;

        @Column(nullable = false, length = 255)
        private String address;

        @Column(nullable = false, length = 15)
        private String phoneNumber;

        @Column(nullable = false, length = 255)
        private String email;

        @Column(nullable = false, length = 50)
        private String city;

        @Column(nullable = false, length = 50)
        private boolean isOpen;

        @Column(nullable = false)
        private boolean homeService;

        @Column(nullable = false)
        private boolean active;

        @Column(nullable = false)
        private Long ownerId;

        @Column(nullable = false)
        private LocalTime openTime;

        @Column(nullable = false)
        private LocalTime closeTime;

        // No-args constructor
        public Salon() {
        }

        // All-args constructor
        public Salon(Long id, String name, List<String> images, String address, String phoneNumber, String email,
                     String city, boolean isOpen, boolean homeService, boolean active,
                     Long ownerId, LocalTime openTime, LocalTime closeTime) {
                this.id = id;
                this.name = name;
                this.images = images;
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

        public List<String> getImages() {
                return images;
        }

        public void setImages(List<String> images) {
                this.images = images;
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

        // toString method
        @Override
        public String toString() {
                return "Salon{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", images=" + images +
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
                        '}';
        }
}
