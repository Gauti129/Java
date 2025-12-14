package collection_map_examples;
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapp 
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(4, "hum");
		hm.put(41, "um");
		hm.put(40, "hm");
		hm.put(42, "om");
		hm.put(0, "humoo");
		hm.put(2, "hum");
		
		/*	-----------------------For loop--------------------------------*/
		
		
        System.out.println("For Loop:");
        for (Map.Entry me : hm.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

	/*	-----------------------Sorting--------------------------------*/
		
		System.out.println("Before sorting");
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Entry) it.next();
			System.out.println(me.getKey()+" "+me.getValue());
			
		}
		
		System.out.println("After sorting");
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(hm);
		Set s1=tm.entrySet();
		Iterator it1=s1.iterator();
		while(it1.hasNext())
		{
			Map.Entry me2=(Map.Entry) it1.next();
			System.out.println(me2.getKey()+" "+me2.getValue());
		}
		
		System.out.println("Reverse order");
		TreeMap<Integer, String> tm1=new TreeMap<Integer, String>(Collections.reverseOrder());

}
}
