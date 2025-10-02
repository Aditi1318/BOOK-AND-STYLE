package com.zosh.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginDto {

	@NotBlank
	@NotNull
	@Email
	private String email;

	@NotBlank
	@NotNull
	private String password;

	// No-args constructor
	public LoginDto() {
	}

	// All-args constructor
	public LoginDto(String email, String password) {
		this.email = email;
		this.password = password;
	}

	// Getters and Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString method
	@Override
	public String toString() {
		return "LoginDto{" +
				"email='" + email + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
