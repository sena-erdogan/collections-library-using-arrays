import java.util.*;
class Driver{

	public static void main(String args[]){
	
		HashSet<Integer> hashSetInt = new HashSet<Integer>();
		HashSet<String> hashSetString = new HashSet<String>();
		
		hashSetString.add("P.S.");
		
		hashSetInt.add(17);
		
		hashSetString.add("please if you get a chanse");
		
		hashSetInt.add(653);
		
		hashSetString.add("put some flowrs");
		
		hashSetInt.add(4);
		
		hashSetString.add("on Algernons grave in the bak yard.");
		
		hashSetInt.setSize(20);
		hashSetString.setSize(15);
		
		if(hashSetInt.isEmpty() == true)	System.out.println("hashSetInt is empty");
		else					System.out.println("hashSetInt is not empty");
		
		if(hashSetString.isEmpty() == true)	System.out.println("hashSetString is empty");
		else					System.out.println("hashSetString is not empty");
		
		System.out.println("size of hashSetInt: " + hashSetInt.getSize());
		
		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		ArrayList<String> arrayListString = new ArrayList<String>();
		
		arrayListInt.add(5);
		
		arrayListString.add("Snow");
		
		arrayListInt.add(65);
		
		arrayListString.add("lands");
		
		arrayListInt.add(37);
		
		arrayListString.add("on");
		
		arrayListInt.add(89);
		
		arrayListString.add("top");
		
		arrayListInt.setSize(5);
		arrayListString.setSize(10);
		
		if(arrayListInt.isEmpty() == true)	System.out.println("arrayListInt is empty");
		else					System.out.println("arrayListInt is not empty");
		
		if(arrayListString.isEmpty() == true)	System.out.println("arrayListString is empty");
		else					System.out.println("arrayListString is not empty");
		
		LinkedList<Integer> linkedListInt = new LinkedList<Integer>();
		LinkedList<String> linkedListString = new LinkedList<String>();
		
		linkedListString.add("Sometimes");
		
		linkedListInt.add(235);
		
		linkedListString.add("human");
		
		linkedListInt.add(64);
		
		linkedListString.add("places");
		
		linkedListInt.add(549);
		
		linkedListString.add("create");
		
		linkedListInt.add(3985);
		
		linkedListString.add("inhuman");
		
		linkedListInt.add(4);
		
		linkedListString.add("monsters");
		
		linkedListInt.add(0);
		
		linkedListInt.setSize(7);
		linkedListString.setSize(7);
		
		System.out.println("size of linkedListString: " + linkedListString.getSize());
		
		if(linkedListInt.isEmpty() == true)	System.out.println("linkedListInt is empty");
		else					System.out.println("linkedListInt is not empty");
		
		if(linkedListString.isEmpty() == true)	System.out.println("linkedListString is empty");
		else					System.out.println("linkedListString is not empty");
		
		if(linkedListInt.contains(64) == true)	System.out.println("linkedListInt contains 64");
		else					System.out.println("linkedListInt does not contain 64");
		
		if(linkedListString.contains("Blue") == true)	System.out.println("linkedListString contains Blue");
		else					System.out.println("linkedListString does not contain Blue");
		
		if(hashSetInt.contains(653) == true)	System.out.println("hashSetInt contains 653");
		else					System.out.println("hashSetInt does not contain 653");
		
		if(hashSetString.contains("sky") == true)	System.out.println("hashSetString contains sky");
		else					System.out.println("hashSetString does not contain sky");
		
		if(arrayListInt.contains(8) == true)	System.out.println("arrayListInt contains 8");
		else					System.out.println("arrayListInt does not contain 8");
		
		if(arrayListString.contains("Snow") == true)	System.out.println("arrayListString contains Snow");
		else					System.out.println("arrayListString does not contain Snow");
				
		linkedListInt.remove(64);
		
		linkedListInt.removeAll(arrayListInt);
		linkedListString.retainAll(arrayListString);
		
		arrayListInt.remove(89);
		arrayListString.remove("lands");
		
		arrayListString.addAll(hashSetString);
		
		hashSetInt.remove(17);
		hashSetInt.remove(21);
	
	}

}
