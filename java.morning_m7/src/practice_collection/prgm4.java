package practice_collection;

import java.util.ArrayList;

public class prgm4 
{
	public static void main(String[] args) 
	{
		ArrayList<Long> a=new ArrayList<Long>();
		a.add(100l);
		a.add(2090l);
		a.add(3560l);
		a.add(2,32234l);
		ArrayList<Long> b=new ArrayList<Long>();
		b.add(455l);
		b.add(3434455l);
		b.add(456232l);
		b.add(0,4023l);
		a.addAll(b);
		a.addAll(1,b);
		a.remove(0);
		a.removeAll(b);
		System.out.println(a.size());
		System.out.println(a.contains(23));
		System.out.println(a.get(2));
		System.out.println(a);
		for( Long c:a)
		{
			System.out.println(c);
			
}
	
}
}

