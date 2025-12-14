package arraylist;
import java.util.*;
public class sort {
	

	public static void main(String[] args) {
	    /*
	     * Integer class implements Comparable
	     * Interface so we can use the sort method
	     */
	    int[] arr = {11,55,22,0,89};
	    Arrays.sort(arr);
	    System.out.print("Sorted Int Array: ");
	    System.out.println(Arrays.toString(arr));
	        
	    /*
	     * String class implements Comparable
	     * Interface so we can use the sort method
	     */
	    System.out.print("Sorted String Array: ");
	    String[] names = {"Steve", "Ajeet", "Kyle"};
	    Arrays.sort(names);
	    System.out.println(Arrays.toString(names));
	        
	     /*
	      * String class implements Comparable
	      * Interface so we can use the sort method
	      */
	     System.out.print("Sorted List: ");
	     List fruits = new ArrayList();
	     fruits.add("Orange");
	     fruits.add("Banana");
	     fruits.add("Apple");
	     fruits.add("Guava");
	     fruits.add("Grapes");
	     Collections.sort(fruits);
	     
	  }
	}
