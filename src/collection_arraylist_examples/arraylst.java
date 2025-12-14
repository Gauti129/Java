package collection_arraylist_examples;
import java.util.*;

public class arraylst {

	public static void main(String[] args) 
	{

/*---------------------------------------------Inialization----------------------------------------------------------*/
		
		
     ArrayList<String> arr=new ArrayList<String>();
     arr.add("12");
     arr.add("string");
     arr.add("zstring");
     System.out.println(arr);
     
     
     
     ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(12,13,14));
     System.out.println(a1);
     
     
     ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));// initialize as same no.of copies
	  System.out.println("ArrayList items: "+intlist);
	  
	  
/*---------------------------------------------looping----------------------------------------------------------*/

	  
	  
	  System.out.println("For loop");
	  for(int i=0;i<a1.size();i++)
	  {
		  System.out.print(a1.get(i));
		  System.out.print("\t");
		  
		  
	  }
	  
	  System.out.println("\nFor Each loop");
	  for(Integer k: a1)
	  {
		  System.out.print(k);
		  System.out.print("\t");
		  
	  }
	  
	  System.out.println("\nIterator");
	  Iterator<Integer> i1=a1.iterator();
	  while(i1.hasNext())
	  {
		  System.out.print("\t"+i1.next());
		 
		  
	  }
	  
	  System.out.println("\nEnumeration");
	  Enumeration<Integer> e=Collections.enumeration(a1);
	  while(e.hasMoreElements())
	  {
		  
		  System.out.println("\n"+e.nextElement());
	  }
	  
	}
	
	
/*---------------------------------------------Sorting----------------------------------------------------------*/

	
}

