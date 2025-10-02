package com.zosh.payload.request;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {

    private String username;
    private boolean enabled;
    private String firstName;
    private String lastName;
    private String email;
    private List<Credential> credentials = new ArrayList<>();
    private List<String> realmRoles = new ArrayList<>();

    // No-args constructor
    public UserRequest() {
    }

    // All-args constructor
    public UserRequest(String username, boolean enabled, String firstName, String lastName, String email,
                       List<Credential> credentials, List<String> realmRoles) {
        this.username = username;
        this.enabled = enabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credentials = credentials;
        this.realmRoles = realmRoles;
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Credential> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public List<String> getRealmRoles() {
        return realmRoles;
    }

    public void setRealmRoles(List<String> realmRoles) {
        this.realmRoles = realmRoles;
    }
}
