package BasicAssignment2;

public class TwoDimensionalArray {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int [][]firstarray = {{1,1,1},
				{1,1,1}};
		int [][]secondarray = {{2,2,2},
				{2,2,2}};
		int resultarray[][] = new int[3][3];
		
	System.out.println("Sum of matrices");
	
		for(int i=0;i<firstarray.length;i++) {
			
			for(int k=0;k<secondarray[0].length;k++) {
				resultarray[i][k]= firstarray[i][k]+secondarray[i][k];
				System.out.print(resultarray[i][k]+"\t");
			}
			System.out.println();
		}
		
	}

}
