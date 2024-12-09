package practice_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class prgm46 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Double> a=new LinkedHashSet<Double>();
		  a.add(23.3d);
		  a.add(4.33d);
		  a.add(2.32d);
		  a.add(2.4d);
		  a.add(2.4d);
		  System.out.println(a);
		  LinkedHashSet<Double> b=new LinkedHashSet<Double>();
		  b.add(21.3d);
		  b.add(1.34d);
		  b.add(12.34d);
		  b.add(1.3d);
		  System.out.println(b);
		  a.addAll(b);
		  a.addAll(b);
		  a.remove(0);
		  a.removeAll(b);
		  System.out.println(a);
		  System.out.println(a.size());
		  System.out.println(a.contains(4));
		 
		  for( double d:a)
		  {
			  System.out.println(d);
		  
		  
		}

	}

}
