package list_Interface_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {

		// ArrayList<String> Declaration
		ArrayList<String> al = new ArrayList<String>();
		// add method for String ArrayList
		al.add("Ram");
		al.add("Shyam");
		al.add("CPS");
		al.add("John");
		al.add("Steve");
		System.out.println("Elements of ArrayList of String Type: " + al);

		// ArrayList<Integer> Declaration
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		// add method for integer ArrayList
		al2.add(1);
		al2.add(34);
		al2.add(99);
		al2.add(99);
		al2.add(78);
		System.out.println("Elements of ArrayList of Integer Type: " + al2);

		// adding collections to one arraylist
		// Similar type of list can be added.
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(666);
		// al3.addAll(al2);
		System.out.println("Merged : " + al3);

		// Adding ArrayList2 in ArrayList1 at 1st position(index =0)
		al3.addAll(0, al2);
		al3.remove(0);
		System.out.println("Merged------- : " + al3);

		// Sublist
		ArrayList<Integer> subList = new ArrayList<Integer>(al2.subList(2, 5));
		System.out.println("Sublist------- : " + subList);

		System.out.println("Last occurrence of element 99: " + al2.lastIndexOf(99));
		System.out.println("First element of the ArrayList: " + al2.get(0));
		System.out.println("Index of '99': " + al2.indexOf(99));
		System.out.println("'100' is present in arraylist: " + al2.contains(100));

		Collections.swap(al2, 1, 4);
		System.out.println("After swapping " + al2);

		System.out.println("Is ArrayList Empty: " + al2.isEmpty());

		al2.set(2, 7777);
		System.out.println("After updating value " + al2);

		//al2.ensureCapacity(50);

		// al2.trimToSize();

		// al2.clear();
		// al2.removeAll(al2);
		// System.out.println("Clear " + al2);

	}
}
