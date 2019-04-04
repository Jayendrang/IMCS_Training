package BasicCaseStudies;

class BankAccount{
	
	int accountNumber;
	double accountAmount;
	String customerName;
	
	public BankAccount() {
	
	}
	
	public BankAccount(int accnum, double accamount, String name) {
		this.accountAmount=accnum;
		this.accountAmount=accamount;
		this.customerName=name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		this.accountAmount = accountAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}

public class BankingCaseStudy {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		account.setCustomerName("Murugeshan");
		account.setAccountNumber(666);
		account.setAccountAmount(5000);
		
		
		do {
			account.setAccountAmount(account.getAccountAmount()-500);
			
			if(account.getAccountAmount()>=500) {
				System.out.println("Current Balance -> \t $"+account.getAccountAmount());
			} else {
				System.out.println("The balance is below minimum $500 \t, Your current balance \t"+account.getAccountAmount());
			}
		}while(account.getAccountAmount()>=500);
		
	}

}
