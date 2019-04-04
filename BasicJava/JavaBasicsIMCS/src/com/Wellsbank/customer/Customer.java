package com.Wellsbank.customer;

public class Customer {
	int customerId;
	String customerName;
	String customerAddress;
	int pincode;

	public Customer() {
	}

	public Customer(int id, String name, String address, int zip) {
		this.customerId = id;
		this.customerName = name;
		this.customerAddress = address;
		this.pincode = zip;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}