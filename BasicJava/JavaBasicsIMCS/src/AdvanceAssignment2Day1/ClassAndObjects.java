package AdvanceAssignment2Day1;

public class ClassAndObjects {

	private String id;
	private String name;
	private String address;
	private String pincode;

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + address + "\t" + pincode;
	}

	public static void main(String[] args) {

		ClassAndObjects cob = new ClassAndObjects();
		cob.id = "01";
		cob.name = "J";
		cob.address = "Trichy";
		cob.pincode = "601001";

		System.out.println(cob.toString());

	}

}