package com.zosh.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zosh.domain.UserRole;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthResponse {

	private String jwt;
	private String refresh_token;
	private String message;
	private String title;
	private UserRole role;

	// No-args constructor
	public AuthResponse() {
	}

	// All-args constructor
	public AuthResponse(String jwt, String refresh_token, String message, String title, UserRole role) {
		this.jwt = jwt;
		this.refresh_token = refresh_token;
		this.message = message;
		this.title = title;
		this.role = role;
	}

	// Getters and setters

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}
