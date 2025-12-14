package collection_hashset_examples;
import java.util.*;
public class hashset 
{
public static void main(String args[])
{
	HashSet<String> h1=new HashSet<String>();
	h1.add("A");
	h1.add("b");
	h1.add("d");
	h1.add("c");
	h1.add("i");
	System.out.println(h1);
	for(String s:h1)
	{
		System.out.print(s+"\n");
	}
	
	
	/*------------------Array conversion------------------------*/
	
	String[] array = new String[h1.size()];
	h1.toArray(array);
	for(String s:array)
	{
		System.out.println(s);
	}
	
	/*------------------List conversion------------------------*/
	
	List<String> al=new ArrayList<String>(h1);
	System.out.println(al);
	
}
}
