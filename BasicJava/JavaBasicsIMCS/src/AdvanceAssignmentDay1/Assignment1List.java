package AdvanceAssignmentDay1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment1List {

	public void printCustomers(List<String> arrayLists) {
		Iterator<String> data = arrayLists.iterator();
		System.out.println("Customer details are");
		while (data.hasNext()) {
			System.out.println("Customer name > \t" + data.next());
		}
	}

	public static void main(String[] args) {

		List<String> data = new ArrayList<String>() {
			{
				add("Raj");
				add("Kumar");
				add("Siva");
				add("Pichumani");
				add("Surya");
			}
		};
		
		Assignment1List assignment = new Assignment1List();
		assignment.printCustomers(data);
	}

}