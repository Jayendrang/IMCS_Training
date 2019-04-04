package AdvanceAssignment2Day1;

class EmployeeGrades {
	int employeeNumber;
	String employeeName;
	float customerFeedback1 = 0, customerFeedback2 = 0, customerFeedback3 = 0;
	double averageFeedback;
	char grade;

	public EmployeeGrades() {
		
	}
	
	public EmployeeGrades(int eNum, String name, float custFb1, float custFb2, float custFb3) {
		this.employeeNumber = eNum;
		this.employeeName = name;
		this.customerFeedback1 = custFb1;
		this.customerFeedback2 = custFb2;
		this.customerFeedback3 = custFb3;
	}

	public void calculateAverageFeedBack() {
		this.averageFeedback = (customerFeedback1 + customerFeedback2 + customerFeedback3) / 3;
	}

	public void calcuateGrade() {
		if (averageFeedback > 4 && averageFeedback < 6) {
			grade = 'C';
		} else if (averageFeedback > 6 && averageFeedback < 8) {
			grade = 'B';
		} else if (averageFeedback > 8 && averageFeedback <= 10) {
			grade = 'A';
		}
	}

	public void displayInfo() {
		System.out.println("Name \t" + employeeName + "\nID \t" + employeeNumber + "\nAverage Feedback \t"
				+ averageFeedback + "\nGrade \t" + grade + "\n ---------------------");

	}

}

public class Assignment10abcdUnderstandingConstructor {

	public static void main(String[] args) {
		EmployeeGrades employee1 = new EmployeeGrades(1002, "RamSiva", 9, 3, 10);
		employee1.calculateAverageFeedBack();
		employee1.calcuateGrade();
		employee1.displayInfo();
		
		EmployeeGrades employeeGrades = new EmployeeGrades();
		employeeGrades.displayInfo();
	}

}