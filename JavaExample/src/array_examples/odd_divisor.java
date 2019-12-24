package array_examples;
import java.io.*;
import java.util.*;

public class odd_divisor 
{
	
	
	static long countSum(int[] numbers) 
	{ 
			long sum=0;
		int value;
		
		for(int i=0; i<numbers.length;i++)
		{
			value=numbers[i];
			
			for(int j=1;j<=Math.sqrt(value);j++)
			{				
				if(value%j==0)
				{
					if(j%2!=0)
					{
					sum=sum+j;
					}
					
				
				
				if(value/j!=j)
				{
					if(value/j%2!=0)
					{
						sum=sum+value/j;
						
					}
					
				}
                }
			}
			
		}
		return sum;
	}
		
		
		
		/*for(int i=0, j=1; i<numbers.length;i++)
		{
			while(j<=numbers[i])
			{
				
				if(numbers[i]%j==0)
				{
					sum=sum+j;
					j=j+2;
				}
				System.out.println(sum);
			}
			
		
		}
		
		
    }*/
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
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

        res = countSum(numbers);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}


