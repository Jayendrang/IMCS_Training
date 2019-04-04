package AdvanceJavaAssignmentPart1;

public class WellsBankAccounts {
	private String accountNumber;
	private String accountType;
	private double balance;
	private String holderName;

	public WellsBankAccounts() {
	}

	public WellsBankAccounts(String accNum, String type, double balance, String name) {
		this.accountNumber = accNum;
		this.accountType = type;
		this.balance = balance;
		this.holderName = name;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return this.getHolderName() + "\t" + this.getAccountNumber() + "\t" + this.getAccountType() + "\t"
				+ this.getBalance();
	}
}
