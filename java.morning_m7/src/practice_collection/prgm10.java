package practice_collection;

import java.util.Vector;

public class prgm10 
{
	public static void main(String[] args) 
	{
		Vector<Short> a=new Vector<Short>();
		a.add((short) 234);
		a.add((short) 2345);
		a.add((short) 5322);
		a.add((short) 112);
		a.add(2,(short) 24);
		System.out.println(a);
		Vector<Short> b=new Vector<Short>();
		b.add((short) 67);
		b.add((short) 90);
		b.add((short) 454);
		b.add((short) 4456);
		System.out.println(b);
		a.addAll(b);
		a.addAll(3,b);
		a.remove(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(19));
		System.out.println(a.get(2));
		for(Short b1:a)
		{
			System.out.println(b1);
		}
		
	}		
}
