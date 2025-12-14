package hackerRank_training_examples;
import java.util.*;

public class ashley 
{
	 static void countNumbers(int[][] arr) 
	    {
		
		 int[] arrayCount=new int[100000];
	        arrayCount[0]=0;
	        for(int i=1;i<100000;i++)
	        {
	            if(nonRepeat(i)) 
	            	arrayCount[i]=arrayCount[i-1]+1;
	            else arrayCount[i]=arrayCount[i-1];
	        }
	        for(int i=0;i<arr.length;i++)
	                                        {
	                                            int m=arr[i][1];
	                    int n=arr[i][0];
	                    int count=arrayCount[m]-arrayCount[n-1];
	                    System.out.println(count);
	                                        }
	    }

	    static boolean nonRepeat(int value)
	    {
	        HashSet<Integer> hs=new HashSet<>();
	                                    int x,y=value,c=0;
	                                    while(y!=0)
	                                    {
	                                              x=y%10;
	                                              y=y/10;
	                                              hs.add(x);
	                                              c++;
	                                    }
	                                    if(c!=hs.size()) return false;
	                        else return true;
	    }


	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_rows = 0;
        int arr_cols = 0;
        arr_rows = Integer.parseInt(in.nextLine().trim());
        arr_cols = Integer.parseInt(in.nextLine().trim());

        int[][] arr = new int[arr_rows][arr_cols];
        for(int arr_i = 0; arr_i < arr_rows; arr_i++) {
            for(int arr_j = 0; arr_j < arr_cols; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
          in.nextLine();
        }

        countNumbers(arr);
        
    }
}

