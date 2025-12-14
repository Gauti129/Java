package hackerRank_Training_Examples;
import java.util.HashSet;
import java.util.Scanner;



public class ashley1 
{
	
	
	
	 static void countNumbers(int[][] arr) 
	    {
		
		        int count,flag,remainder,value;
		        int row= arr.length;
		        int col =arr[0].length;
		       for(int i=0;i<row;i++)
		       {
		            count=0;
		            for(int j=arr[i][0];j<=arr[i][col-1];j++)
		            {
		                flag=0;
		                value=j;
		                HashSet<Integer> h= new HashSet<Integer>();
		              if(value>9) 
		            	  while(value>0)
		                  {
		                      
		                      remainder=value%10;
		                      if(h.contains((remainder)))
		                      {
		                          flag=1;
		                          break;
		                      }
		                      else
		                          h.add((remainder));
		                      value=value/10;
		                  }
		                  if(flag==0)
		                      count++;
		              }
		              System.out.println(count);
		          }

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

