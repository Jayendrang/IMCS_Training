package AdvanceJavaAssignmentPart1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class TresuryManager {

	public static  Set<WellsBankAccounts> accountDetails = new HashSet<WellsBankAccounts>();

	
	
	public void addNewAccount(WellsBankAccounts account) {
		accountDetails.add(account);
	}

	public void removeAccount(WellsBankAccounts account) {
		if (Objects.nonNull(account)) {
			accountDetails.remove(account);
		}
	}

	synchronized public WellsBankAccounts getAccountInfo(WellsBankAccounts account) throws ApplicationException {
		if (Objects.nonNull(account)) {
			return (WellsBankAccounts) accountDetails.stream()
					.filter(a -> a.getAccountNumber().equals(account.getAccountNumber())).findFirst().get();
		} else {
			throw new ApplicationException("Account Not Found");
		}
	}

	synchronized public WellsBankAccounts updateAccountBalance(WellsBankAccounts account) throws ApplicationException {
		if (accountDetails.contains(account)) {
			Optional<WellsBankAccounts> taccount = accountDetails.parallelStream()
					.filter(a -> a.getAccountNumber().equals(account.getAccountNumber())).findFirst();
			taccount.get().setBalance(account.getBalance());
			accountDetails.remove(account);
			accountDetails.add(account);
			return getAccountInfo(account);
		}
		return null;
	}

}