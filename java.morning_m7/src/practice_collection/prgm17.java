package practice_collection;

import java.util.LinkedList;

public class prgm17 
{
	public static void main(String[] args)
	{
		
		LinkedList<Short> a=new LinkedList<Short>();
		a.add((short)10);
		a.add((short)20);
		a.add((short)46);
		a.add(2,(short)49);
		System.out.println(a);
		LinkedList<Short> b=new LinkedList<Short>();
		b.add((short)20);
		b.add((short)49);
		b.add(1,(short)50);
		System.out.println(b);
		a.addAll(b);
		a.addAll(3,b);
		a.remove(2);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(20));
		System.out.println(a.get(1));
		for(Short i:a)
		{
			System.out.println(i);
	}
}
}
