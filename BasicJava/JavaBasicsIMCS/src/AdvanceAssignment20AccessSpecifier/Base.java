package AdvanceAssignment20AccessSpecifier;

public class Base {
	int variable1;
	private int variable2;
	protected int variable3;
	public int variable4;

	Base() {
		variable1=100;
		variable2=200;
		variable3=300;
		variable4=400;
		
	}
	
	int getVariable1() {
		return variable1;
	}
	
	public int getVariable2() {
		return variable2;
	}
}	
