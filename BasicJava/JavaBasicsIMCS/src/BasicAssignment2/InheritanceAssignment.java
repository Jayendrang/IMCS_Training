package BasicAssignment2;

import java.util.Comparator;

abstract class CalculateTutionFees {

	abstract double calculateFees();

}

class CourseRegistration {

	static protected int regId;
	protected String courseName;

	public CourseRegistration() {
		++regId;
	}

	public CourseRegistration(String name) {
		this.courseName = name;
	}

	public void displayCourseDetails() {
		System.out.println("Registration ID	: \t" + this.regId);
		System.out.println("Course Name		: \t" + this.courseName);
	}

}

class StudentClass extends CalculateTutionFees {

	private int student_id;
	private char student_type;
	private String student_name;
	private double feesPerMonth;

	public StudentClass() {
	}

	public StudentClass(int id, char type, String name, double fees) {
		this.student_id = id;
		this.student_type = type;
		this.student_name = name;
		this.feesPerMonth = fees;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public char getStudent_type() {
		return student_type;
	}

	public void setStudent_type(char student_type) {
		this.student_type = student_type;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	protected String displayStudentDetails() {
		return this.student_name + "\t" + this.student_id + "\t" + this.student_type + "\t" + this.feesPerMonth + "\n";
	}

	@Override
	public String toString() {
		return this.student_name + "\t" + this.student_id + "\t" + this.student_type + "\t" + this.feesPerMonth + "\n";
	}

	@Override
	public double calculateFees() {
		return this.feesPerMonth / 6.0d;
	}
}

class DayScholar extends StudentClass {
	private String residentialAddress;

	public DayScholar() {

	}

	public DayScholar(int id, char type, String name, double fees, String residentadd) {
		super(id, type, name, fees);
		this.residentialAddress = residentadd;

	}

	// public void calculateFees() {
	// setFeesPerMonth(getFeesPerMonth()/6);
	// }

	public double getDayScholarFees() {
		calculateFees();
		return getFeesPerMonth();
	}

	@Override
	public String displayStudentDetails() {
		// TODO Auto-generated method stub
		return super.displayStudentDetails() + "\t " + this.residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

}

class PostGradStudents extends StudentClass {

	int postGradCourseId;
	double postGradCourseFee;
	String postGradCourseName;

	public PostGradStudents() {

	}

	public PostGradStudents(int pid, double fee, String name) {
		this.postGradCourseId = pid;
		this.postGradCourseFee = fee;
		this.postGradCourseName = name;
	}

	public int getPostGradCourseId() {
		return postGradCourseId;
	}

	public void setPostGradCourseId(int postGradCourseId) {
		this.postGradCourseId = postGradCourseId;
	}

	public double getPostGradCourseFee() {
		return postGradCourseFee;
	}

	public void setPostGradCourseFee(double postGradCourseFee) {
		this.postGradCourseFee = postGradCourseFee;
	}

	public String getPostGradCourseName() {
		return postGradCourseName;
	}

	public void setPostGradCourseName(String postGradCourseName) {
		this.postGradCourseName = postGradCourseName;
	}

}

class Hostelite extends StudentClass implements Comparable<StudentClass> {

	private String hostel_name;
	private int room_number;

	public Hostelite() {
	}

	public Hostelite(int id, char type, String name, double fees, String hname, int rmnum) {
		super(id, type, name, fees);
		this.hostel_name = hname;
		this.room_number = rmnum;
	}

	public String getHostel_name() {
		return hostel_name;
	}

	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	@Override
	public String displayStudentDetails() {
		return super.displayStudentDetails() + toString();
	}

	@Override
	public String toString() {
		return super.toString() + this.hostel_name + "\t" + this.room_number + "\n";
	}

	@Override
	public int compareTo(StudentClass studentInfo) {

		return this.getStudent_id() - studentInfo.getStudent_id();
	}

	@Override
	public double calculateFees() {
		return super.getFeesPerMonth() + 1200;
	}
}

public class InheritanceAssignment {

	public static void main(String[] args) {

		if (args[1].charAt(0)=='H') {
			Hostelite hostelite = new Hostelite(Integer.parseInt(args[0]),
					args[1].charAt(0),
					args[2],
					Double.parseDouble(args[3]),
					args[4], 
					Integer.parseInt(args[5]));
			System.out.println(hostelite.toString());

		} else if (args[1].charAt(0)=='D') {
			DayScholar dayScholar = new DayScholar(Integer.parseInt(args[0]),
					args[1].charAt(0),
					args[2],
					Double.parseDouble(args[3]),args[4]);
					System.out.println(dayScholar.toString());
		} else {
			System.err.println("Improper Student Type");
		}

		// Hostelite hostelite = new Hostelite(1002, 'H', "Jayendran",
		// 4500.35d,"Recommendations", 12);
		// DayScholar dayscholar = new DayScholar(1012, 'D', "Senthil", 4500.25d,
		// "TamilNadu,India");
		// System.out.println("Base fees ::"+hostelite.toString());
		// System.out.println("Including hostel fee ::"+hostelite.calculateFees());
		// StudentClass dayscholar1 = new DayScholar();
		// StudentClass hostelite1 = new Hostelite();
		// dayscholar1.setStudent_type('D');
		// System.out.println(hostelite1.getStudent_type());

	}

}
