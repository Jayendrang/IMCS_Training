package AdvanceAssignment21GarbageCollection;

public class GarbageCollections {

	String garbageLocation;
	GarbageCollections garbage;
	
	public static void main(String[] args) {
	
		GarbageCollections garbage1 = new GarbageCollections();
		garbage1.garbage = new GarbageCollections();
		garbage1.garbageLocation="NYC";
		garbage1.garbage.garbageLocation="CHG";
		
		System.out.println(garbage1.garbageLocation);
		System.out.println(garbage1.garbage.garbageLocation);
		
		garbage1.garbage.garbage=garbage1;
		garbage1.garbage.garbage=null;
		garbage1.garbage=null;
		garbage1=null;
		
		
	}

}