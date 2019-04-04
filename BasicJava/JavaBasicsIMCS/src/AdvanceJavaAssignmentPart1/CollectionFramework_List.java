package AdvanceJavaAssignmentPart1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class LoginDetails{
	
	private static Map<String,String> CustomerCreds = new HashMap<>(); 
	public LoginDetails() {
	
	}
	
	public void addNewUserMap(Map<String, String> data) {
	CustomerCreds.putAll(data);	
	}
	
	public void addNewUser(String username,String password)
	{
		CustomerCreds.put(username, password);
	}
	
	public void displayAllCustomerInfo() {
		Iterator iterator = CustomerCreds.keySet().iterator();
		System.out.println("UserName\t\tPassword");
		while(iterator.hasNext()) {
			String key = iterator.next().toString();
			System.out.println(key+"\t\t"+CustomerCreds.get(key));
		}
	}
}

public class CollectionFramework_List {

	public <T> void printCustomer(Object customerlist) {
		if (customerlist instanceof List) {
			System.out.println("\n\nList \n------------------");
			Iterator<String> data = ((List) customerlist).iterator();

			while (data.hasNext()) {
				System.out.println(data.next());
			}
		} else if (customerlist instanceof Set) {
			System.out.println("\n\nHash Set \n---------------");
			Iterator<String> data = ((Set) customerlist).iterator();

			while (data.hasNext()) {
				System.out.println(data.next());
			}
		} else if (customerlist instanceof Map) {
			System.out.println("\n\nHash Set \n---------------");
			Iterator hashMapIterator = ((Map) customerlist).keySet().iterator();
			while (hashMapIterator.hasNext()) {
				String data = hashMapIterator.next().toString();
				System.out
						.println("Key :" + "\t " + data + "\t Value : \t"+((Map) customerlist).get(hashMapIterator.next().toString()));
			}

		}
	}

	public static void main(String[] args) {

		ArrayList<String> customer_data = new ArrayList<String>() {
			{
				add("Jay");
				add("Senthil");
				add("Ramya");
				add("Kumar");
				add("Srini");
			}
		};

		Set<String> customer_set = new HashSet<String>() {
			{
				add("Steve");
				add("Mark");
				add("Bell");
				add("Danielle");
				add("Korsova");
			}
		};
		Map<String, String> customerHashMap = new HashMap<String, String>() {
			{
				put("1", "Subramani");
				put("2", "Ramamani");
				put("3", "Goundamani");
				put("4", "Ramani");
			}
		};
		
		CollectionFramework_List listdata = new CollectionFramework_List();
		//listdata.printCustomer(customer_data);
		//listdata.printCustomer(customer_set);
		//listdata.printCustomer(customerHashMap);
		
		LoginDetails customerLoginDetails = new LoginDetails();
		customerLoginDetails.addNewUserMap(customerHashMap);
		customerLoginDetails.addNewUser("Jayendrang","KarupattiTea");
		customerLoginDetails.addNewUser("Ramya","SeeniMittai");
		customerLoginDetails.displayAllCustomerInfo();
	}

}
