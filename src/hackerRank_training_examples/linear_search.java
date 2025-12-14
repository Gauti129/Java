package hackerRank_training_examples;
import java.util.*;
public class linear_search 
{
	public static void main(String args[])
	{
		int array[]=new int[5];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{array[i]=s1.nextInt();}
		System.out.println("Enter number to be searched");
		int x=s1.nextInt();
		
		for(int j=0;j<=array.length;j++)
		{
			if(array[j]==x)
			{
			System.out.println("Element found at"+j);
			}			
		}
		
		
		
		
	}

}
