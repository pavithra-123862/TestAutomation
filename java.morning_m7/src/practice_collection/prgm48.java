package practice_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class prgm48 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Boolean> a=new LinkedHashSet<Boolean>();
			a.add(true);
			a.add(true);
			a.add(false);
			a.add(true);
			System.out.println(a);
			LinkedHashSet<Boolean> b=new LinkedHashSet<Boolean>();
			b.add(true);
			b.add(false);
			b.add(true);
			b.add(true);
			System.out.println(b);
			a.addAll(b);
			a.addAll(b);
			a.remove(1);
			System.out.println(a);
		    System.out.println(a.size());
		    System.out.println(a.contains(true));
		 
		    for( Boolean b1:a)
		    {
		    	System.out.println(b1);
		    			
		    }
	}
}
