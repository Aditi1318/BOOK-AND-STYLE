package com.zosh.payload.request;

import com.zosh.domain.UserRole;

public class SignupDto {
	private String email;
	private String password;
	private String phone;
	private String fullName;
	private UserRole role;

	// Default constructor
	public SignupDto() {}

	// Parameterized constructor
	public SignupDto(String email, String password, String phone, String fullName, UserRole role) {
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.fullName = fullName;
		this.role = role;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}
