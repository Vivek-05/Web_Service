package com.user.model;

public class LoginBean {

	private int userId;
	private String userEmailId;
	private String deviceToken;
	private String firstName;
	private String lastName;
	private String userRole;

	public LoginBean() {
		super();
	}

	public LoginBean(int userId, String userEmailId, String deviceToken, String firstName, String lastName,
			String userRole) {
		super();
		this.userId = userId;
		this.userEmailId = userEmailId;
		this.deviceToken = deviceToken;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userRole = userRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "LoginBean [userId=" + userId + ", userEmailId=" + userEmailId + ", deviceToken=" + deviceToken
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", userRole=" + userRole + "]";
	}

}