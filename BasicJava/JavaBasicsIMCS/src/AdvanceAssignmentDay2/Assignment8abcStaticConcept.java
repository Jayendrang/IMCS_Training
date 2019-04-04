package AdvanceAssignmentDay2;

class Loan {
	int loanNumber, accountNumber, customerNumber, loanDuration;
	float loanAmount, interest;
	static int loan_counter;

	static {
		loan_counter++;
	}
	
	private Loan() {
		loan_counter++;
	}

	public Loan(int loanNo, int accNo, int custNo, int loanDur, float amt, float interest) {
		this.loanNumber = loanNo;
		this.accountNumber = accNo;
		this.customerNumber = custNo;
		this.loanDuration = loanDur;
		this.loanAmount = amt;
		this.interest = interest;
		//loan_counter++;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	public static Loan getInstance() {
		return new Loan();
	}

	public static int numberOfObjectsCreated()
	{
		return loan_counter;
	}
	@Override
	public String toString() {
		return "Loan Counter-->\t" + loan_counter + "\n" + "Loan Number\t" + loanNumber + "\nAccountNumber\t" + accountNumber
				+ "\nCustomerNumber\t" + customerNumber + "\nDuration\t" + loanDuration + "\nLoanAmount\t" + loanAmount
				+ "\nInterest\t" + interest + "\n-----------------------------------------";
	}
	
}

public class Assignment8abcStaticConcept {

	public static void main(String[] args) {

	//	Loan loan1 = new Loan();
	//	System.out.println(loan1.toString());
		
		Loan loan2 = new Loan(12001, 100210, 11111, 10, 25000f, 1.68f);
		System.out.println(loan2.toString());
		
		Loan loan3 = Loan.getInstance();
		System.out.println(loan3.toString());
		
		Loan loan4 = Loan.getInstance();
		System.out.println(loan4.toString());
		
		System.out.println(""+Loan.numberOfObjectsCreated());
	}

}
