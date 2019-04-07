package AdvanceAssignmentIOHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {

	public static String acceptString() {
		String stringdata = null;
		BufferedReader bufferedReader = null;
		try {

			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			stringdata = bufferedReader.readLine();
		} catch (Exception exception) {
			exception.getMessage();
		}
		return stringdata;
	}

	public static void main(String[] args) throws IOException {

		ReadData.acceptString();
	}

}
