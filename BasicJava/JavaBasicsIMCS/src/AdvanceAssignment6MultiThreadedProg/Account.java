package AdvanceAssignment6MultiThreadedProg;

import AdvanceAssignmentDay4CollectionsGenerics.CustomerInfo;

public class Account {

	private int accountNumber;
	private CustomerInfo customer;
	protected double accountBalance;
	
	public Account() {
	}
	
	public Account(int accNo, CustomerInfo custInfo, double acctBalance)
	{
		this.accountNumber=accNo;
		this.customer = custInfo;
		this.accountBalance=acctBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
}
