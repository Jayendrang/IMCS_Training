package BasicAssignmen1;

public class BooleanDataType {

	public static void main(String[] args) {
		
		boolean bool1=true,bool2=false,bool3=true;
		int intVal=100;
		byte byteVal=(byte)intVal;
		byte max = 127;
		byte min = -128;
		
		
		if(bool1||(bool1 && bool2==false)) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
		System.out.println("Bool value  "+bool2);
		
		byte sum = (byte) (max+min);
		System.out.println(sum); 
		
	}

}
