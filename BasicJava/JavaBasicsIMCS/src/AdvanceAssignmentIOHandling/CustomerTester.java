package AdvanceAssignmentIOHandling;

import java.io.IOException;

public class CustomerTester {

	public void acceptCustomerInfo() {

		System.out.println("Please enter the customer details........!");
		System.out.println("Enter customer id :\t");
		int custId = Integer.parseInt(ReadData.acceptString());
		System.out.println("Enter customer Name :\t");
		String custName = ReadData.acceptString();
		System.out.println("Enter customer address :\t");
		String custAddrs = ReadData.acceptString();
		System.out.println("Enter customer type :\t");
		String custType = ReadData.acceptString();

		Customer customer = new Customer();
		customer.setCustomerNo(custId);
		customer.setCustomerName(custName);
		customer.setCustomerAddress(custAddrs);
		customer.setCustomerType(custType);
		int status = new CustomerFileDB().saveCustomer(customer);
		if (status == 0) {
			System.out.println("Your details are saved");
			ReadData.acceptString();
		} else {
			System.out.println("Your details are not saved");
			ReadData.acceptString();
		}

	}

	public void displayCustInfo() {
		System.out.println("\t Please enter customer Id: ");
		int custId = Integer.parseInt(ReadData.acceptString());

		Customer customer = new CustomerFileDB().getCustomer(custId);
		if (customer != null) {
			System.out.println("\n Customer Id\t: " + customer.getCustomerNo());
			System.out.println("\n Customer Name\t: " + customer.getCustomerName());
			System.out.println("\n Customer Address\t: " + customer.getCustomerAddress());
			System.out.println("\n Customer Type\t:" + customer.getCustomerType());

		} else {
			System.out.println("Customer not found! ");
			ReadData.acceptString();
		}

	}

	public void customerMenu() throws NumberFormatException, IOException {
		boolean continueflag = true;
		while (continueflag) {
			System.out.println("\t\t\tCustomer Menu");
			System.out.println("=============================================================");
			System.out.println("1. Add Customer");
			System.out.println("2. Get Customer info");
			System.out.println("3. Exit");
			System.out.println("Enter the option");
			String option = ReadData.acceptString();

			switch (Integer.parseInt(option)) {
			case 1:
				acceptCustomerInfo();
				break;
			case 2:
				displayCustInfo();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the valid data");
				ReadData.acceptString();
			}
			System.out.println("Do you want to continue (Y/N)");
			String flag = ReadData.acceptString();
			if (flag.equalsIgnoreCase("Y")) {
				continueflag = true;
			} else {
				continueflag = false;
				System.out.println("\t\t\t THANK YOU \t\t");
			}
		}
	}
}
