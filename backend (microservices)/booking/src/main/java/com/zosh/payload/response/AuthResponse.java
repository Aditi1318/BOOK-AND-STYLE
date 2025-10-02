package com.zosh.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zosh.domain.UserRole;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthResponse {

	private String jwt;
	private String message;
	private String title;
	private UserRole role;

	// No-args constructor
	public AuthResponse() {
	}

	// All-args constructor
	public AuthResponse(String jwt, String message, String title, UserRole role) {
		this.jwt = jwt;
		this.message = message;
		this.title = title;
		this.role = role;
	}

	// Getters and Setters

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
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

	// toString method

	@Override
	public String toString() {
		return "AuthResponse{" +
				"jwt='" + jwt + '\'' +
				", message='" + message + '\'' +
				", title='" + title + '\'' +
				", role=" + role +
				'}';
	}
}
