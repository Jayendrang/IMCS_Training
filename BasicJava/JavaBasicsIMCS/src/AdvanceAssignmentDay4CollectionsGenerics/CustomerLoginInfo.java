package AdvanceAssignmentDay4CollectionsGenerics;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CustomerLoginInfo {
	
	CustomerLoginInfo(){
		
	}
	
	

	private HashMap<Integer, String> loginMap = new LinkedHashMap<Integer, String>();

	public void addLogin(int userid, String password) {
		loginMap.put(userid, password);
	}
	
	
}
