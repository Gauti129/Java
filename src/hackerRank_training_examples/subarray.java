package hackerRank_training_examples;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;


public class subarray 
{
    
	static long count(int[] numbers, int k)
	{
		
		long prod=1;
		
       for(int i=0;i<numbers.length;i++)
       {
    	   
    	   for (int j = i; j <numbers.length; j ++)
           {
               
               for (int p = i; p <= j; p++)
               {
                   prod= prod*numbers[p] ;
                   
                   
               }
               
              
           }
       }
       return prod ;
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
        int numbers_size = 0;
        numbers_size = Integer.parseInt(in.nextLine().trim());

        int[] numbers = new int[numbers_size];
        for(int i = 0; i < numbers_size; i++) {
            int numbers_item;
            numbers_item = Integer.parseInt(in.nextLine().trim());
            numbers[i] = numbers_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = count(numbers, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}

