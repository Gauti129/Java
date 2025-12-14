package list_Interface_examples;


import java.util.*;
public class ArrayListSort  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("India");
	   listofcountries.add("US");
	   listofcountries.add("China");
	   listofcountries.add("Denmark");

	   /*Unsorted List*/
	   System.out.println("------Before Sorting----------:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listofcountries);

	   /* Sorted List*/
	   System.out.println("-------After Sorting------:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}
	   
	   //Reverse Order
	   Collections.sort(listofcountries, Collections.reverseOrder());
	   System.out.println("--------1--ArrayList in descending order----------:");
	   for(String str: listofcountries){
			System.out.println(str);
		}
	   
	   //Reverse Order
	   Collections.sort(listofcountries); 
	   Collections.reverse(listofcountries);;
	   System.out.println("--------2--ArrayList in descending order----------:");
	   for(String str: listofcountries){
			System.out.println(str);
		}
	   
	}
}
