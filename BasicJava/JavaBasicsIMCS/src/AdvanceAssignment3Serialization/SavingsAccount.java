package AdvanceAssignment3Serialization;

import java.io.Serializable;

import AdvanceAssignment6MultiThreadedProg.Account;
import AdvanceAssignmentDay4CollectionsGenerics.CustomerInfo;

public class SavingsAccount implements Serializable {

	private float rateofInterest;
	private double minimumBalance;
	private Account account;

	public SavingsAccount(int accNo, CustomerInfo customer, double balance, float intrestRate, double minBalance) {
		account = new Account(accNo, customer, balance);
		this.rateofInterest = intrestRate;
		this.minimumBalance = minBalance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public float getRateofInterest() {
		return rateofInterest;
	}

	public void setRateofInterest(float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

}
