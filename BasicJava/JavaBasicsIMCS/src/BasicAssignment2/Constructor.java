package BasicAssignment2;

class Student {

	int student_id;
	char student_type;

	public Student() {
		this.student_id=10;
		this.student_type='F';
	}
	public int getStudent_id() {
		return student_id;
	}

	public char getStudent_type() {
		return student_type;
	}

}

class UserType{
	
		String name;
		public UserType(String param) {
			this.name=param;
		}
		
		public UserType() {
			this("student");
		}
		
	
}

public class Constructor {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1.getStudent_id()+"--------"+st1.getStudent_type());
	
		UserType type0 = new UserType("Faculty");
		UserType type1 = new UserType();
		
		System.out.println(type0.name);
		System.out.println(type1.name);
		int k=2,i=3;
		for(int m=0;m<6;m++,i--) {
			System.out.println(k+"--"+i);
		}
	}

}
