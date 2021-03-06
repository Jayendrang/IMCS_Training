package AdvanceJavaAssignmentPart1;

public class WellsBankTransaction extends Thread {

	private static int transactionId;
	private WellsBankAccounts accounts;
	private TresuryManager tresuryManager;
	private double transactionAmount;
	private String transactionType;

	public WellsBankTransaction() {

	}

	public WellsBankTransaction(WellsBankAccounts account, double transAmount, String transtype) {
		this.setAccounts(account);
		this.setTransactionAmount(transAmount);
		this.setTransactionType(transtype);
		this.transactionId += 1;
	}

	synchronized public void performTransaction() throws ApplicationException {
		TresuryManager tresuryManager = new TresuryManager();
		try {
			if (this.getTransactionType().equals("DEP")) {
				WellsBankAccounts tempAccount = tresuryManager.getAccountInfo(new WellsBankAccounts(
						this.getAccounts().getAccountNumber(), this.getAccounts().getAccountType(), 0.0d, null));
				System.out.println("Balance Before Transaction--> \t" + tempAccount.toString());
				tempAccount.setBalance(tempAccount.getBalance() + this.getTransactionAmount());
				this.setAccounts(tresuryManager.updateAccountBalance(tempAccount));
				System.out.println("Balance After Transaction---> \t" + this.toString());
			} else if (this.getTransactionType().equals("WID")) {

				WellsBankAccounts tempAccount = tresuryManager.getAccountInfo(new WellsBankAccounts(
						this.getAccounts().getAccountNumber(), this.getAccounts().getAccountType(), 0.0d, null));
				System.out.println("Balance Before Transaction--> \t" + tempAccount.toString());
				tempAccount.setBalance(tempAccount.getBalance() - this.getTransactionAmount());
				this.setAccounts(tresuryManager.updateAccountBalance(tempAccount));
				System.out.println("Balance After Transaction---> \t" + this.toString());

			} else {
				throw new ApplicationException("Transaction setup miss-match");
			}
		} catch (ApplicationException ape) {
			System.out.println("Transaction Failed");
			ape.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Transaction Failed");
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			performTransaction();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	public static int getTransactionId() {
		return transactionId;
	}

	public static void setTransactionId(int transactionId) {
		WellsBankTransaction.transactionId = transactionId;
	}

	public WellsBankAccounts getAccounts() {
		return accounts;
	}

	public void setAccounts(WellsBankAccounts accounts) {
		this.accounts = accounts;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTransactionType() + "\t \t " + this.getAccounts().toString();
	}

}
