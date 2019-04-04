package AdvanceAssignment2Day1;

class Employee{
	String firstname,lastname,middlename;
	String mailId;
	String dateofbirth;
	String gender;
	String maritalstatus;
	String type;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name \t:"+firstname+","+middlename+","+lastname+"\nE-Mail\t:"+mailId+"\nDate of Birth\t:"+dateofbirth+
				"\nGender\t:"+gender+"\nMarital Status\t:"+maritalstatus+"\nType\t:"+type+"\n------------------------------------\n";
	}
}

public class Assignment6ClassMemberInitializing {

	
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.firstname="Paul";
		employee1.middlename="J";
		employee1.lastname="Anderson";
		employee1.mailId="paul@wellfargo.com";
		employee1.type="Salary";
		employee1.gender="M";
		employee1.maritalstatus="Married";
		
		Employee employee2 = new Employee();
		employee2.firstname="Paul";
		employee2.middlename="J";
		employee2.lastname="Anderson";
		employee2.mailId="paul@wellfargo.com";
		employee2.type="Salary";
		employee2.gender="M";
		employee2.maritalstatus="Married";
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
	}

}
