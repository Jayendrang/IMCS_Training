package BasicAssignment2;

public class ControlStatement {

	public static void main(String[] args) {

		boolean bool = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(j + "\t");
				if (j > 5) // break;
					continue;
			}
			System.out.println("Outer Loop");
		}

		char Grade = '\0';
		int marks = 500;
		if (marks >= 80 && marks <= 100) {
			Grade = 'A';
		} else if (marks >= 73 && marks <= 79) {
		} else if (marks >= 65 && marks <= 72) {
			Grade = 'C';
		} else if (marks >= 55 && marks <= 64) {
			Grade = 'D';
		} else {
			Grade = 'E';
		}
		//
		switch (Grade) {
		case 'A':
			Grade = 'A';
			break;
		case 'B':
			Grade = 'B';
			break;
		case 'C':
			Grade = 'B';
			break;
		case 'D':
			Grade = 'C';
			break;
		case 'E':
			Grade = 'D';
			break;
			
		default:
			Grade = '\0';
			break;

		}

		System.out.println("End");

	}

}
