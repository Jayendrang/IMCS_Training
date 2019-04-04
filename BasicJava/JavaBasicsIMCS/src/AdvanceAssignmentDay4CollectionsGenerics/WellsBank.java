package AdvanceAssignmentDay4CollectionsGenerics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WellsBank {

	private static final CustomerDB customerDB = new CustomerDB();
	private static final CustomerLoginInfo customerLogin = new CustomerLoginInfo();
	
	public static void listAllCustomers(List<CustomerInfo> data) {
		System.out.println("\nCustomer Info "
				+ "\n--------------------------------------------------"
				+ "\n"
				+ "CustomerId\tCustomerName\tLoanAvailed\n");
		Iterator<CustomerInfo> iterator = data.iterator();
		while(iterator.hasNext()){
			CustomerInfo info = iterator.next();
		
			System.out.println(info.getCustomerId()+"\t\t"+info.getCustomerName()+"\t\t"+info.isLoanAvailed());
		}
		
		
		
	}

	public static void main(String[] args) throws Exception {
		
		CustomerInfo cust1 = new CustomerInfo(10, "Kuppu", true);
		CustomerInfo cust2 = new CustomerInfo(11, "Raju", false);
		CustomerInfo cust3 = new CustomerInfo(12, "Gami", true);
		CustomerInfo cust4 = new CustomerInfo(13, "Kosal", false);
		CustomerInfo cust5 = new CustomerInfo(14, "Korumi", true);

		customerDB.saveNewCustomer(cust1);
		customerDB.saveNewCustomer(cust2);
		customerDB.saveNewCustomer(cust3);
		customerDB.saveNewCustomer(cust4);
		customerDB.saveNewCustomer(cust5);

		customerLogin.addLogin(10, "WellsForGo");
		customerLogin.addLogin(11, "WellsForGo");
		customerLogin.addLogin(12, "WellsForGo");
		customerLogin.addLogin(13, "WellsForGo");
		customerLogin.addLogin(14, "WellsForGo");

		List<CustomerInfo> customersInfo=customerDB.getAllCustomers();

		Set<Integer> customerloan = customerDB.getLoanAvailedCustomers();
		System.out.println("Loan availed customer account numbers ");
		for (Integer numbers : customerloan) {
			System.out.println(numbers);
		}
		
		WellsBank.listAllCustomers(customersInfo);
		

	}

}