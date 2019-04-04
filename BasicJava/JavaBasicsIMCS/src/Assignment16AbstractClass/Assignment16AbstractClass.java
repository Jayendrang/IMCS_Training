package Assignment16AbstractClass;

class Customer {
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

class Account {
	int accountNumber;
	Customer customer;
	double balance;

	public Account() {
	}

	public Account(int accNo, Customer tCustomer, double bal) {
		this.accountNumber = accNo;
		this.customer = tCustomer;
		this.balance = bal;

	}

	public Customer getCustomer() {
		return this.customer;
	}

	public double balanceEnquiry() {
		return this.balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
		System.out.println("Balance after deposit\t$"+this.balance);
	}
	

}

class SavingsAccount extends Account {

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

class OverdraftAccount extends Account {
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

public class Assignment16AbstractClass {

//	public void transaction(Account acc,double amt) {
//		acc.deposit(amt);
//	}
	

	
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
