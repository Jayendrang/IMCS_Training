package AdvanceAssignment5Debug;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {

	public void showRecords(Set<Integer> set) {
		if(!set.isEmpty()) {
			Iterator<Integer> iterator=set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next()); 
				
			}
		}else {
			System.out.println("Set is empty");
		}
	}
	
	public static void main(String[] args) {
		
		Debug debug = new Debug();
		Set<Integer> data = new HashSet<Integer>() {
			{
				add(10);
				add(11);
				add(12);
				add(13);
				add(10);
				
			}
		};
		
		debug.showRecords(data);

	}

}
