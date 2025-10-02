package com.zosh.payload.request;

import com.zosh.domain.UserRole;

public class SignupDto {

	private String email;
	private String password;
	private String phone;
	private String fullName;
	private String username;
	private UserRole role;

	// No-args constructor
	public SignupDto() {
	}

	// All-args constructor
	public SignupDto(String email, String password, String phone, String fullName, String username, UserRole role) {
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.fullName = fullName;
		this.username = username;
		this.role = role;
	}

	// Getters and setters

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}
