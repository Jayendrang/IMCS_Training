package AdvanceJavaAssignmentPart1;

public class WellsBankTransactionManager {

	public static void main(String[] args) {

		TresuryManager tresuryManager = new TresuryManager();
		tresuryManager.addNewAccount(new WellsBankAccounts("1001", "SAV", 250.50d, "Jayendran"));
		tresuryManager.addNewAccount(new WellsBankAccounts("1002", "CHK", 250.00d, "Ramya"));
		tresuryManager.addNewAccount(new WellsBankAccounts("1003", "CHK", 500.50d, "Jeyaraman"));
		tresuryManager.addNewAccount(new WellsBankAccounts("1004", "SAV", 1250.50d, "Senthil"));
		tresuryManager.addNewAccount(new WellsBankAccounts("1005", "CC", 2250.50d, "Siva"));
		tresuryManager.addNewAccount(new WellsBankAccounts("1006", "SAV", 1250.50d, "Srini"));

		WellsBankTransaction transaction = new WellsBankTransaction(new WellsBankAccounts("1001", "SAV", 0, ""), 60.05d,
				"WID");
		//transaction.performTransaction();
		transaction.start();

		WellsBankTransaction transaction2 = new WellsBankTransaction(new WellsBankAccounts("1001", "SAV", 0, ""), 100.05d,
				"DEP");
		transaction2.start();
		//System.out.println(transaction.toString());

		
		
	}

}
