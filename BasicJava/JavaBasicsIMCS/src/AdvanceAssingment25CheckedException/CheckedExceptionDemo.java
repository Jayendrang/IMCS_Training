package AdvanceAssingment25CheckedException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
	
		try {
			Class.forName("AdvanceAssingment25CheckedException.ExceptionDemo");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
