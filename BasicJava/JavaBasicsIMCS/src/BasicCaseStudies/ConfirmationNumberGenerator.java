package BasicCaseStudies;

import java.util.Random;

public class ConfirmationNumberGenerator {

	private static Integer sequence_number = 0001;

	public ConfirmationNumberGenerator() {

	}

	public static String GenerateConfirmationNumber(int companycode, char travelmode, int modenumber) {
		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(companycode));
		builder.append(travelmode);
		builder.append(String.valueOf(modenumber));
		builder.append(String.valueOf(sequence_number));
		return builder.toString();
	}

	public static void main(String[] args) {

	//	System.out.println(ConfirmationNumberGenerator.GenerateConfirmationNumber(101, 'F',201));
	
		Integer data = new Integer(0001);
		System.out.println(data.toString());
	
	}

}
