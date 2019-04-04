package BasicAssignmen1;

public class Operator {

	public static void main(String[] args) {
		 
		int intVal=10;
		float floatVal=3.0f;
		boolean bool1=true,bool2=false,bool3=true;
		
		System.out.println("Arithmatic");
		System.out.println("Mod %"+intVal%floatVal);
		//
		
		System.out.println("Concatenation");
		System.out.println("Day"+2+"Session");
		System.out.println("\n"+2+3+"\n"+(2+3));
		
		System.out.println("Relational");
		System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
		floatVal=10.0f;
		System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
		
		System.out.println();
		if(bool1||(bool1 && bool2==false)) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
		System.out.println("Bool value"+bool2);
		
	}

}
