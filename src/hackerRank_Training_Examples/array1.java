package hackerRank_Training_Examples;
import java.util.*;
public class array1 
{
	
	public static void main(String args[])
	{
	int b[]={1,4,9,0,3};
	
	
	int a[]=new int[5];
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter 5 Numbers");
	for(int i=0;i<5;i++)
	{
	a[i]=s1.nextInt();
	}

	System.out.println("5 Numbers Entered");
	for(int i=0;i<5;i++)
	{
	System.out.println(a[i]);


	}
	for(int i=0;i<5;i++)
	{

	System.out.println("\t"+b[i]);

	}
	}
	}


