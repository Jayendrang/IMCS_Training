package AdvanceAssignment3Serialization;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import AdvanceAssignmentDay4CollectionsGenerics.CustomerInfo;

public class Debug {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		CustomerInfo customerInfo = new CustomerInfo(2, "Jay", false);
		SavingsAccount savingsAccount = new SavingsAccount(12, customerInfo, 100.32d, 2.2f, 25);
		FileOutputStream fOutStream = new FileOutputStream("SerDeData.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fOutStream);
		objectStream.writeObject(savingsAccount);
		objectStream.close();

		FileInputStream fInStream = new FileInputStream("SerDeData.ser");
		ObjectInputStream objectInStream = new ObjectInputStream(fInStream);

		SavingsAccount savingAc = (SavingsAccount) objectInStream.readObject();
		System.out.println(savingAc.getAccount().getAccountNumber() + "\t" + savingAc.getMinimumBalance() + "\t"
				);
		objectInStream.close();

	}

}
