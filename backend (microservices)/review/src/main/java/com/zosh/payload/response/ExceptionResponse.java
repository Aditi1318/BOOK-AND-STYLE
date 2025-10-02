package com.zosh.payload.response;

import java.time.LocalDateTime;

public class ExceptionResponse {

    private String message;
    private String error;
    private LocalDateTime timestamp;

    // No-args constructor
    public ExceptionResponse() {
    }

    // All-args constructor
    public ExceptionResponse(String message, String error, LocalDateTime timestamp) {
        this.message = message;
        this.error = error;
        this.timestamp = timestamp;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // toString method
    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "message='" + message + '\'' +
                ", error='" + error + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
