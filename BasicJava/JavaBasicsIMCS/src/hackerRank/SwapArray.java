package hackerRank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArray {
	static int[] rotLeft(int[] a, int d) {
		int result[] = a;
		int temp = 0;
		for (int s = 1; s <= d; s++) {
			for (int k = 0; k < result.length; k++) {
				if (k == 0) {
					temp = result[k];
					result[k] = result[k + 1];
				} else if (k == result.length - 1) {
					result[k] = temp;
				} else {
					result[k] = result[k + 1];
				}
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("/home/jayendrang/IMCSS/BasicJava/JavaBasicsIMCS/src/hackerRank/data.txt");
		FileReader freadear = new FileReader(file);
		BufferedReader breader = new BufferedReader(freadear);
		int []dataarray;
		List<String> listdata = new ArrayList<>();
		while(breader.ready()) {
			String data = breader.readLine().trim();
			listdata=Arrays.asList(data.split(" ").toString());
		}
		System.out.println(listdata.size());
		
//		int[] array = { 1, 2, 3, 4, 5 };
//		int[] swaptime = { 4 };
//		int[] swaparray =null;
//		for (int st : swaptime) {
//			 swaparray = SwapArray.rotLeft(array, st);
//		}
//		for (int s : swaparray) {
//			System.out.println(s);
//		}

	}

}
