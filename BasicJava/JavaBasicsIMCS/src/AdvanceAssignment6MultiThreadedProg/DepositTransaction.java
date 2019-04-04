package AdvanceAssignment6MultiThreadedProg;

public class DepositTransaction extends Thread{

	private int transactionId;
	private Account account;
	private double amount;
	private int customerId;
	
	public DepositTransaction(int transid,Account acc,int custId,double transamount) {
		this.transactionId=transid;
		this.account=acc;
		this.amount=transamount;
		this.customerId=custId;
	}
	
	public void deposit(Account account,double amount) {
		
		account.setAccountBalance(account.getAccountBalance()+amount);
	}
	
	@Override
	public void run() {
		this.deposit(account, amount);
		System.out.println(getTransactionId()+"\t transaction"+
		"completed!!!"
		+ "\nCustomerId \t"+getCustomerId()
		+ "\nThank your depositing, Current balance is $"+getAccount().getAccountBalance());
		
	}
	

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
