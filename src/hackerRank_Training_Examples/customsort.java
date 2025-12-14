package hackerRank_Training_Examples;
import java.util.*;
import java.io.*;
public class customsort 
{
	static int moves(int[] a)
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0){even++;};
		}
			
			for(int j=0;j<even;j++)
			{
				if(a[j]%2!=0){odd++;};
				
			}
			
	return odd;	
	}
		
	
	
	/*	int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0 && (i+1)<a.length )
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2==0)
					{
						a[j]=a[i];
						count++;
						
					}
					
				}
				
				
				
			}
			
		}
		
		
return count;
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

        int res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        res = moves(a);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
