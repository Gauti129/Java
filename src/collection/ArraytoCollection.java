package collection;

import java.util.*;
public class ArraytoCollection {

	public static void main(String[] args) 
	{ 
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		List<Integer> l1=new ArrayList<Integer>(n);
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
			/*l1.add(a[i]);*/
			
		}
		
		for(int p=0;p<n;p++)
		{
			
			l1.add(a[p]);
		}
		
		
		for(Integer k: l1)
		{
			System.out.println(k);
			
		}
		
		
		
		for(int j=0;j<l1.size();j++)
		{
			System.out.println(l1.get(j));
			
		}
		
		
		
		
	

	}}
