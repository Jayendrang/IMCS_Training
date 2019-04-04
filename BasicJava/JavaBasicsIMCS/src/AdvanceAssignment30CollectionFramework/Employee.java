package AdvanceAssignment30CollectionFramework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Employee {
	
	private int employeeId;
	public String name;
	protected Calendar dob;
	double sal;
	
	public Employee() {
		System.out.println("Class loaded successfully");
		
	}

	public Employee(int id,String name, Calendar dob) {
		this.employeeId=id;
		this.name=name;
		this.dob=dob;
	}
	public static void main(String[] args) {
	
		Employee emp1 = new Employee(1,"j",new Calendar.Builder().build().getInstance());
		Employee emp2 = new Employee(2,"k",new Calendar.Builder().build().getInstance());

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		
		for(Employee emp :list) {
			System.out.println(emp.employeeId+"\t"+emp.name);
		}
		
	}

}
