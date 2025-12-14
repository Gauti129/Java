package list_Interface_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListInitialize {

	public static void main(String[] args) {

		// 1st method
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(6);
		System.out.println("1--------------" + al);

		// 2nd Method : Using Array.asList
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(2, 3, 4));
		System.out.println("2--------------" + li);

		// 3rd Method : Using Anonymous Inner class
		List<Integer> lis = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(2);
				add(1);
			}
		};
		System.out.println("3--------------" + lis);

		// 4th Method : Using ncopies
		List<Integer> list = new ArrayList<Integer>(Collections.nCopies(5, 10));
		System.out.println("4--------------" + list);

	}
}
