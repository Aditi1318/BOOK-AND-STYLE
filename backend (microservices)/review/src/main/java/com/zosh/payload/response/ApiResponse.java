package com.zosh.payload.response;

public class ApiResponse {
    private String message;

    // No-args constructor
    public ApiResponse() {
    }

    // All-args constructor
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

    // toString method
    @Override
    public String toString() {
        return "ApiResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
