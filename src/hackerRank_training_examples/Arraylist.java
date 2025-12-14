package hackerRank_training_examples;
import java.util.*;
import java.util.ArrayList;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(5);
		System.out.println(arraylist);
		
		Collections.reverse(arraylist);
		
		System.out.println(arraylist);

	}

}
