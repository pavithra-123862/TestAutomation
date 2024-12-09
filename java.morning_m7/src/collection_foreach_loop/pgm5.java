package collection_foreach_loop;

import java.util.Vector;

public class pgm5 
{
public static void main(String[] args) 
{
	Vector a=new Vector();
	  a.add(10);
	  a.add("who");
	  a.add('c');
	  System.out.println(a);
	  a.add(2,"why");
	  System.out.println(a);
	  for (Object o:a)
		{
			System.out.println(o);
		}
		
}
}
