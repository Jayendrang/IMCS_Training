package BasicAssignment2;

class StudentInfo{
	
	int studentId;
	String studentName;
	String resedentialStatus;
	double feesPerMonth;
	
	
	public StudentInfo() {
	}
	
	public StudentInfo(int lid,String name,String status,int fees) {
		this.studentId=lid;
		this.studentName=name;
		this.resedentialStatus=status;
		this.feesPerMonth=fees;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String lname) {
		this.studentName =lname;
	}
	
	
	public String getResedentialStatus() {
		return resedentialStatus;
	}

	public void setResedentialStatus(String resedentialStatus) {
		this.resedentialStatus = resedentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public double calculateFees(double semesterfee) {
		return this.feesPerMonth = (semesterfee/6d);
	}
		
	public double calculateFees(double hostelfee,double semesterfee) {
		return this.feesPerMonth=hostelfee+(semesterfee/6d);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.studentId+"\n"+"\n"+this.studentName+"\n"+this.resedentialStatus
				+"\n"+this.feesPerMonth;
	}
	
}

public class CommandLineArgs {

	public static void main(String[] args) {
	
		System.out.println(args[0]);
		StudentInfo studentInfo = new StudentInfo(Integer.parseInt(args[0]), args[1], args[2], Integer.parseInt(args[3]));
		if(studentInfo.getResedentialStatus().equals("S")) {
			
		}
		
	}

}
