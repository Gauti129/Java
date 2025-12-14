package hackerRank_training_examples;
import java.io.*;
import java.util.*;

public class movie {
	
	
	static long maximumSum(int[] arr) 
	{
		long sum=Integer.MIN_VALUE;
		long sum1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
			
			if(sum<sum1)
			{
				sum=sum1;				
			}
			
			if(sum1<0)
			{
				sum1=0;
			}	
			
		}
				
return sum;
    }
	
	
	
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        long res;
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        res = maximumSum(arr);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}



