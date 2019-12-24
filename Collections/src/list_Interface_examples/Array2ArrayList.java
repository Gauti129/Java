package list_Interface_examples;

import java.util.*;

public class Array2ArrayList {
	public static void main(String[] args) {

		/* Array Declaration and initialization */
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New City2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist) {
			System.out.println(str);
		}

		// 2nd Method

		Collections.addAll(citylist, citynames);
		System.out.println("2nd Method--------------" + citylist);

		// 3rd Method

		for (int i = 0; i < citynames.length; i++) {
			citylist.add(citynames[i]);
		}
		System.out.println("2nd Method--------------" + citylist);
	}
}
