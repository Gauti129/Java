package list_Interface_examples;

import java.util.*;

public class ArrayList2Array {

	public static void main(String[] args) {

		/* ArrayList declaration and initialization */
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");

		/* ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];
		for (int j = 0; j < arrlist.size(); j++) {
			array[j] = arrlist.get(j);
		}

		/* Displaying Array elements */
		for (String k : array) {
			System.out.println(k);
		}
		
		// 2nd Method
		System.out.println("--------------2nd Method------------------------------");
		String frnames[]=arrlist.toArray(new String[arrlist.size()]);

		/*Displaying Array elements*/
		for(String k: frnames)
		{
			System.out.println(k);
		}
	}
}
