package com.digient.gitesh.dto;

public class Logging {
	
	private String userId;
	private String userName;
	private String address1;
	private String address2;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	@Override
	public String toString() {
		return "Logging [userId=" + userId + ", userName=" + userName + ", address1=" + address1 + ", address2="
				+ address2 + "]";
	}	

}
