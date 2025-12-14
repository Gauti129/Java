package collection_list_examples;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		// Insert
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add(4, "Five");
		al.add(2, "Six");// Replace index 2 value.

		System.out.println("Inserted List -------" + al);

		// Remove
		al.remove(2);
		al.remove("Four");

		System.out.println("After Removal List -------" + al);

		//Iteration
		for (String it : al) {
			System.out.println("Iteration List -------" + it);
		}
	}
	
	
	

}
