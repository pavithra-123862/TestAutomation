package practice_collection;

import java.util.LinkedList;

public class prgm18 
{
public static void main(String[] args)
{
	LinkedList<Byte> a=new LinkedList<Byte>();
	a.add((byte)10);
	a.add((byte)20);
	a.add((byte)46);
	a.add(2,(byte)49);
	System.out.println(a);
	LinkedList<Byte> b=new LinkedList<Byte>();
	b.add((byte)20);
	b.add((byte)49);
	b.add(1,(byte)50);
	System.out.println(b);
	a.addAll(b);
	a.addAll(3,b);
	a.remove(2);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(20));
	System.out.println(a.get(1));
	for(byte i:a)
	{
		System.out.println(i);
	}
}
}
	

