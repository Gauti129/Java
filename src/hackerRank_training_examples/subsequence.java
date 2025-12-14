package hackerRank_training_examples;
import java.util.*;

public class subsequence 
{
	public static List<List<Integer>> combinations(int[] arr) 
	{
	    List<List<Integer>> c = new ArrayList<List<Integer>>();
	    List<Integer> l;
	    for (int i = 0; i < arr.length; i++) {
	      int k = c.size();
	      for (int j = 0; j < k; j++) {
	        l = new ArrayList<Integer>(c.get(j));
	        l.add(new Integer(arr[i]));
	        c.add(l);
	      }
	      l = new ArrayList<Integer>();
	      l.add(new Integer(arr[i]));
	      c.add(l);
	    }
	    return c;
	}
	
	
	public static void main(String args[])
	{
		int b[]={1,2,3,5,7};
         combinations(b);
		
	}
}
