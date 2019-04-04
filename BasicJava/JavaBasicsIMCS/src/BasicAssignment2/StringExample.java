package BasicAssignment2;

class Students{
	
	int studentId;
	char type;
	String studentName;
	
	public Students() {
	}
	
	public Students(int lid,char ltype,String fname,String lname) {
		this.studentId=lid;
		this.type=ltype;
		this.studentName=fname+","+lname;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String fname,String lname) {
		this.studentName = fname+","+lname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.studentId)+"\n"+this.type+"\n"+this.studentName;
	}
	
}

public class StringExample {

	public static void main(String[] args) {
		char type = 'S';
		Students students = new Students(1, type, "Jayendran", "Gurumoorthy");
		System.out.println(students.toString().toLowerCase());
		students.setStudentName("Deepan","Gurumoorthy");
		System.out.println(students.toString().toUpperCase());
	}

}