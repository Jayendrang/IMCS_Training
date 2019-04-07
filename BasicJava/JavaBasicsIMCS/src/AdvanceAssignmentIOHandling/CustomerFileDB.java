package AdvanceAssignmentIOHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Customer {

	private String customerName, customerAddress, customerType;
	private int customerNo;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

}

public class CustomerFileDB {

	String file = "sample.dat";

	public int saveCustomer(Customer customer) {
		int status = -1;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			String data = customer.getCustomerNo() + ":" + customer.getCustomerName() + ":"
					+ customer.getCustomerAddress() + ":" + customer.getCustomerType() + "\n";
			bufferedWriter.write(data);
			bufferedWriter.flush();
			status = 0;
		} catch (IOException exception) {
			status = -2;
			exception.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		return status;
	}

	public Customer getCustomer(int custNo) {
		Customer customer =null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String []data = null;
			String input=bufferedReader.readLine();
			while(input!=null) {
				data = input.split(":");
				if(Integer.parseInt(data[0])==custNo) {
					customer = new Customer();
					customer.setCustomerNo(Integer.parseInt(data[0]));
					customer.setCustomerName(data[1]);
					customer.setCustomerAddress((data[2]));
					customer.setCustomerType(data[3]);
					break;
				}
				input=bufferedReader.readLine();
			}
		}catch(IOException iexception) {
			iexception.printStackTrace();
		}finally {
			if(fileReader!=null && bufferedReader!=null) {
				try {
					fileReader.close();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		return customer;
	}

	
}
