package AdvanceAssignment6MultiThreadedProg;

public class UnAuthorizedWithdrawTransactionException extends Exception {

	public UnAuthorizedWithdrawTransactionException() {
		super("The account user is unauthorized for the withdrawl");
	}
}
