package AdvanceAssignment6MultiThreadedProg;

import AdvanceAssignmentDay4CollectionsGenerics.CustomerInfo;

public class Security {

	public void authorization(Account account, CustomerInfo customer) throws UnAuthorizedWithdrawTransactionException {
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
		
	}

}
