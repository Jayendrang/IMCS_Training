package AdvanceAssignment6MultiThreadedProg;

public class BankFund {

	
	private double fund;
	
	public BankFund(double funds) {
		this.fund=funds;
	}
	
	public int checkFund(double amount)throws InsufficientBalanceException
	{
		if(fund<amount) {
			throw new InsufficientBalanceException("Insufficient Fund");
		}else
		{
			return 0;
		}
	}
	
	public double debitFund(double amount) {
		fund-=amount;
		return fund;
	}
}
