package BasicAssignment2;

import java.util.stream.Stream;

class StudentDetails{
	
	String name;
	String [] courses = new String[3];
	public StudentDetails() {
	}
	
	public StudentDetails(String studentName, String[] courses)
	{
		this.name=studentName;
		this.courses=courses;
	}
	public String getName() {
		return name;
	}
	public String[] getCourses() {
		return courses;
	}
	
}

public class ArrayOfObject {

	public static void main(String[] args) {
		
		StudentDetails [] studentDetails = new StudentDetails[4];
		studentDetails[0] = new StudentDetails("Tony",new String []{"Java","C","C++"} ); 
		studentDetails[1] = new StudentDetails("Thomas",new String []{"Java","Unix",""} ); 
		studentDetails[2] = new StudentDetails("Dinil",new String []{"Linux","Oracle",""} ); 
		studentDetails[3] = new StudentDetails("Devil",new String []{"RDBMS","C#","Oracle"} ); 
		
		System.out.println(studentDetails[3].getName()+"\n ");
		Stream.of(studentDetails[3].getCourses()).forEach(a->System.out.println(a));
		
	}

}
