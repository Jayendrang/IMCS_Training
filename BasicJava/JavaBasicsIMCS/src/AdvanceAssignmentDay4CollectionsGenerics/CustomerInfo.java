package AdvanceAssignmentDay4CollectionsGenerics;

import java.util.Comparator;

public class CustomerInfo implements Comparable<CustomerInfo>, Comparator<CustomerInfo> {
	int customerId;
	String customerName;
	boolean loanAvailed;

	public CustomerInfo() {
	}

	public CustomerInfo(int id, String name, boolean loanstatus) {
		this.customerId = id;
		this.customerName = name;
		this.loanAvailed = loanstatus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public boolean isLoanAvailed() {
		return loanAvailed;
	}

	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}

	@Override
	public String toString() {
		return this.customerName + "\t" + this.customerId + "\t" + this.loanAvailed;
	}

	@Override
	public int compare(CustomerInfo o1, CustomerInfo o2) {
		return o1.getCustomerId() - o2.getCustomerId();

	}

	@Override
	public int compareTo(CustomerInfo customer) {
		return this.customerId - customer.customerId;
	}
}
