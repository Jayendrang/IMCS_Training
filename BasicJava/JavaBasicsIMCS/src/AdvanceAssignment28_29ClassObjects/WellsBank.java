package AdvanceAssignment28_29ClassObjects;

class Customer {
	int customerId;
	String name, address;
	int pincode;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

public class WellsBank {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.customerId=10012;
		
		System.out.println(customer.getCustomerId());
	}
}
