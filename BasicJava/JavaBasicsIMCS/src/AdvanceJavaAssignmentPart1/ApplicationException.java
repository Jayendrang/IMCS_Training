package AdvanceJavaAssignmentPart1;

public class ApplicationException extends Exception {

	private String applicationExceptionMessage;
	
	public ApplicationException() {
	}
	
	public ApplicationException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
