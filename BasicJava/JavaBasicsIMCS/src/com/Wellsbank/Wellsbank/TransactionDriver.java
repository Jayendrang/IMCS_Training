package com.Wellsbank.Wellsbank;

import com.Wellsbank.account.*;
import com.Wellsbank.customer.*;

public class TransactionDriver {

	public static void main(String[] args) {
		Customer john = new Customer(10, "John McDaniels", "122 SW 1st St", 89910);
		SavingsAccount johnSavings = new SavingsAccount(1001, john, 1000d);
		johnSavings.deposit(1000d);
		System.out.println("Savings a/c Balance \t$" + johnSavings.balanceEnquiry());
	    johnSavings.calculateInterest();
		johnSavings.withdraw(1600d);
		System.out.println("Savings a/c Balance \t$" + johnSavings.balanceEnquiry());

		Customer jenny = new Customer(11, "Jenny Vikram", "Arkansas", 72182);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		OverdraftAccount jennyOdA = new OverdraftAccount(2001, jenny, 500, 2000);
		System.out.println("Overdraft a/c Balance \t$" + jennyOdA.balanceEnquiry());
		jennyOdA.withdraw(1000);
		System.out.println("Overdraft a/c Balance \t$" + jennyOdA.balanceEnquiry());
		jennyOdA.withdraw(4000);
		System.out.println("Overdraft a/c Balance \t$" + jennyOdA.balanceEnquiry());
		jennyOdA.withdraw(3000);
		
		System.out.println("Overdraft a/c Balance \t$" + jennyOdA.balanceEnquiry());


	}

}
