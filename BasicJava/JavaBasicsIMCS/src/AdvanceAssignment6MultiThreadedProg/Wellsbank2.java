package AdvanceAssignment6MultiThreadedProg;

public class Wellsbank2 {

	public static void main(String[] args) {
		
		BankFund wellsbanks = new BankFund(2000000);
		LoanTransaction [] transactions = new LoanTransaction[100];
		
		for(int s=0;s<transactions.length;s++) {
			transactions[s]=new LoanTransaction(wellsbanks, (100+s), 25000);
		}
		
		for(int s=0;s<transactions.length;s++) {
			transactions[s].run();
		}
	}

}
