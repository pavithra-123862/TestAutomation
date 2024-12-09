package practice_collection;

import java.util.Vector;

public class prgm12 
{
	public static void main(String[] args) 
	{
		
		Vector<Long> a=new Vector<Long>();
		a.add(234l);
		a.add(2345l);
		a.add(5322l);
		a.add(112l);
		a.add(2,24254l);
		System.out.println(a);
		Vector<Long> b=new Vector<Long>();
		b.add(6778l);
		b.add(45690l);
		b.add(454l);
		b.add(4456l);
		System.out.println(b);
		a.addAll(b);
		a.addAll(1,b);
		a.remove(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(19));
		System.out.println(a.get(2));
		for(long b1:a)
		{
			System.out.println(b1);
		}
	
}		
}
