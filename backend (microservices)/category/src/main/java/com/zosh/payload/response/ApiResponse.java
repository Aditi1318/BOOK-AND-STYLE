package com.zosh.payload.response;

public class ApiResponse {
    private String message;

    // Parameterized constructor
    public ApiResponse(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }
}
