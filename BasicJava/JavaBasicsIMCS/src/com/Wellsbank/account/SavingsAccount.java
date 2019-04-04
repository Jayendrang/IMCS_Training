package com.Wellsbank.account;
import com.Wellsbank.customer.*;;

public class SavingsAccount extends Account {

	double minmumbalance;
	double interestRate;

	public SavingsAccount() {
		super();
		this.minmumbalance = 500;
		this.interestRate = 0.12d;

	}

	public SavingsAccount(int accNo, Customer cust, double balance) {
		super(accNo, cust, balance);
		this.minmumbalance = 500;
		this.interestRate = 0.12d;
	}

	public void withdraw(double amt) {
		double curBalance = balanceEnquiry();
		if ((curBalance - amt) < minmumbalance) {
			System.out.println("Insufficient balance \t, current balance is \t $" + curBalance);
		} else {
			System.out.println("Availabe Balance \t$" + curBalance);
			curBalance -= amt;
			System.out.println("Withdrawl amount \t$" + amt);
			System.out.println("Current balance \t$" + curBalance + "\n----------------");
			balance = curBalance;
		}
	}

	public void calculateInterest() {
		double tBalance = balance * interestRate;
		System.out.println("Available interest\t$" + (tBalance));
		System.out.println("Balance including interest\t$" + (tBalance + balance) + "\n----------------");

	}
}
