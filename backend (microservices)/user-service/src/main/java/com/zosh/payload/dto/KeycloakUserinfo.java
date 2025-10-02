package com.zosh.payload.dto;

public class KeycloakUserinfo {

    private String sub;
    private String email;
    private String preferred_username;

    // No-args constructor
    public KeycloakUserinfo() {
    }

    // All-args constructor
    public KeycloakUserinfo(String sub, String email, String preferred_username) {
        this.sub = sub;
        this.email = email;
        this.preferred_username = preferred_username;
    }

    // Getters and Setters

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferred_username() {
        return preferred_username;
    }

    public void setPreferred_username(String preferred_username) {
        this.preferred_username = preferred_username;
    }
}
