package hackerRank_Training_Examples;
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class doublesize 
{
	
	static long doubleSize(long[] a, long b) 
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				
			b=b*2;
			}
		}

		return b;
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
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        long[] a = new long[a_size];
        for(int i = 0; i < a_size; i++) {
            long a_item;
            a_item = Long.parseLong(in.nextLine().trim());
            a[i] = a_item;
        }

        long b;
        b = Long.parseLong(in.nextLine().trim());

        res = doubleSize(a, b);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
