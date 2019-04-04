package AdvanceAssignmentDay1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class BankLoginDetails {
	private static Map<Integer, String> CustomerCreds = new HashMap<>();

	public BankLoginDetails() {

	}

	public void addNewUserMap(Map<Integer, String> data) {
		CustomerCreds.putAll(data);
	}

	public void addNewUser(int userid, String username) {
		if (!CustomerCreds.containsKey(userid)) {
			CustomerCreds.put(userid, username);
		} else {
			System.out.println("UserId is already available");
		}
	}

	public void displayAllCustomerInfo() {
		Iterator iterator = CustomerCreds.keySet().iterator();
		System.out.println("UserName\t\tPassword");
		while (iterator.hasNext()) {
			int key = (Integer) iterator.next();

			System.out.println(key + "\t\t" + CustomerCreds.get(key));
		}
	}
}

public class Assignment3Map {

	public static void main(String[] args) {

		BankLoginDetails bankLoginDetails = new BankLoginDetails();
		try {
			bankLoginDetails.addNewUser(10, "jay");
			bankLoginDetails.addNewUser(11, "subbu");
			bankLoginDetails.addNewUser(12, "raja");
			bankLoginDetails.addNewUser(13, "sivomi");
			bankLoginDetails.addNewUser(14, "udaani");
			bankLoginDetails.addNewUser(11, "rosup");

			bankLoginDetails.displayAllCustomerInfo();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}