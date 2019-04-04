package AdvanceAssignment23_24UnhandledException;

public class UnhandledExceptions {

	public static void main(String[] args) {

		String name = null;
		int total = 100, count = 0;
		try {
			int average = total / count;
			System.out.println(average);
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.out.println("The Object is\t" + npe.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception \t" + ae.getMessage());
		}finally {
			System.out.println("Finally block");
			name = "John";
			System.out.println(name.length());
		}
		name = "JohnMarimuthu";
		System.out.println(name.length());
	}

}