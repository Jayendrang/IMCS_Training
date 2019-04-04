package com.app.bean;

public class UserInfo {

	String userName, password, address, cardnum;

	public UserInfo() {

	}

	public UserInfo(String username, String password, String address, String card) {
		this.userName = username;
		this.password = password;
		this.address = address;
		this.cardnum = card;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

}
