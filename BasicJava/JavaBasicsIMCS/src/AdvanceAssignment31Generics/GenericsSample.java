package AdvanceAssignment31Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsSample {

	public static void main(String[] args) {

		ArrayList data = new ArrayList();
		data.add(true);
		data.add(1);
		data.add(2.0d);
		data.add('F');
		data.add("Dumbo");

		for (int s = 0; s < data.size(); s++) {

			if (data.get(s) instanceof Integer) {
				System.out.println(data.get(s));
			} else if (data.get(s) instanceof Double) {
				System.out.println(data.get(s));
			} else if (data.get(s) instanceof String) {
				System.out.println(data.get(s));
			} else if (data.get(s) instanceof Character) {
				System.out.println(data.get(s));
			} else if (data.get(s) instanceof Boolean) {
				System.out.println(data.get(s));
			}

		}

	}

}
