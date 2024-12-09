package programing;

import java.util.Iterator;

public class sumnumbers 
{
	public static int reverse(int no) 
	{
        int	rev=0; 
         while(no!=0)
         {
        	 int rem=no%10;
        	 rev=(rev*10)+rem;
        	 no=no/10;
         }
          return (rev);
	} 


 public static String reversestring(String s)
{
	String rev="";
	for (int i=s.length()-1; i>=0; i--) 
	{
		rev=rev+s.charAt(i);
	}
return rev;
}
}
