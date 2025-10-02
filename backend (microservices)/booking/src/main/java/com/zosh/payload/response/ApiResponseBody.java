package com.zosh.payload.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.zosh.domain.InternalCodeEnum;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponseBody<T> {

    private boolean success;
    private String message;

    @JsonIgnore
    private InternalCodeEnum internalCode;

    private String timestamp;

    private final T data;

    // Full constructor with internalCode
    public ApiResponseBody(boolean success, String message, InternalCodeEnum internalCode, T data) {
        this.success = success;
        this.message = message;
        this.internalCode = internalCode;
        this.timestamp = LocalDateTime.now().toString();
        this.data = data;
    }

    // Constructor without internalCode
    public ApiResponseBody(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.timestamp = ZonedDateTime.now(ZoneOffset.UTC)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        this.data = data;
    }

    // Getters and Setters

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InternalCodeEnum getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(InternalCodeEnum internalCode) {
        this.internalCode = internalCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    // No setter for data since it's final

    @Override
    public String toString() {
        return "ApiResponseBody{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", internalCode=" + internalCode +
                ", timestamp='" + timestamp + '\'' +
                ", data=" + data +
                '}';
    }
}
