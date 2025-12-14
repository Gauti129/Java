package hackerRank_Training_Examples;
import java.util.*;
import java.util.regex.*;

public class substring 
{
	
static void commonSubstring(String[] a, String[] b) 
    {
		String s2;
		String s1;
		HashSet<String> h2=new HashSet<String>();;
		HashSet<String> h1=new HashSet<String>();;
for(int i=0;i<a.length;i++)
{
 s1=a[i];
 h1.add(s1);
}
for(int j=0;j<b.length;j++)
{
 s2=b[j];
 h2.add(s2);
}
while(h1.size()<=h2.size())
{
if(h1.retainAll(h2))
{
System.out.println("YES");	
}
else
{
System.out.println("NO");
break;
}

}
}				
	
    	
		
		/*for(int i=0;i<=a.length;i++)
{
	String s1=a[i];
	String s2=b[i];

 Pattern p=Pattern.compile("["+s2+"]");
 Matcher match=p.matcher(s1);
 if(match.find())
 {
	 System.out.println("Yes");
 }
 else
	 System.out.println("No");
 }

}*/
	
	
	
	
	
	
  
		/*for (int i=0;i<=a.length;i++) {
		            String str1 = a[i];
		            String str2 = b[i];
		            Pattern p = Pattern.compile("["+str1+"]");
		            Matcher m = p.matcher(str2);
		            if (m.find()) { 
		            	System.out.println("YES");
		            }else{
		                System.out.println("NO");
		            }
		        } */
		   
		            
		 

	
	
	
	


		
    
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        String[] a = new String[a_size];
        for(int i = 0; i < a_size; i++) {
            String a_item;
            try {
                a_item = in.nextLine();
            } catch (Exception e) {
                a_item = null;
            }
            a[i] = a_item;
        }

        int b_size = 0;
        b_size = Integer.parseInt(in.nextLine().trim());

        String[] b = new String[b_size];
        for(int i = 0; i < b_size; i++) {
            String b_item;
            try {
                b_item = in.nextLine();
            } catch (Exception e) {
                b_item = null;
            }
            b[i] = b_item;
        }

        commonSubstring(a, b);
        
    }
}

