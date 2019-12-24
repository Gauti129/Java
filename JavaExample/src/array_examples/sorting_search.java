package array_examples;
import java.util.Arrays;
public class sorting_search 
{
 public static void main(String args[])
 {
	 int arr[]={188,33,59,6,7};
	 
	 int arr1[]=new int[5];
	 
	 /*Scanner s1=new Scanner(System.in);
	 for(int i=0;i<5;i++)
	 {
	 arr1[i]=s1.nextInt();
	 }
	 
	 for(int i=0;i<5;i++)
		 System.out.println(arr1[i]);*/
	 
	Arrays.sort(arr); 
	for(int i=0;i<5;i++)
		 System.out.println(arr[i]);
	
	int index=Arrays.binarySearch(arr, 6);
	System.out.println("Number found at"+index);
	
	int x= arr.length;
	System.out.println("length"+x);
	
	 
 }
}
