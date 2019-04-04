package com.Wellsbank.account;

import com.Wellsbank.customer.*;

public class OverdraftAccount extends Account {
	double currentAmount;

	public OverdraftAccount() {
		super();
	}

	public OverdraftAccount(int accNo, Customer cust, double balance, double currentBalance) {
		super(accNo, cust, balance);
		this.currentAmount = currentBalance;
	}

	public void withdraw(double amt) {
		double tBalance = 0d;
		if (balance >= amt) {
			tBalance = balance - amt;
			balance = tBalance;

		} else if (this.currentAmount >= amt) {
			tBalance = amt - balance;
			if (tBalance < currentAmount) {
				currentAmount -= tBalance;
				balance = currentAmount;
				System.out.println("Withdrawl Balance\t$"+amt);
				System.out.println("Current Overdraft a/c balance \t$" + balance);
			} else {
				balance = tBalance;
				System.out.println("Withdrawl Balance\t$"+amt);
				System.out.println("Current Overdraft a/c balance \\t$" + balance);
			}
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public double getEligibilityAmount() {
		return currentAmount;
	}
}
