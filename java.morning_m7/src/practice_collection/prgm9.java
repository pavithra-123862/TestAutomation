package practice_collection;

import java.util.Vector;

public class prgm9 
{
	public static void main(String[] args) 
{
	Vector<Byte> a=new Vector<Byte>();
	a.add((byte) 234);
	a.add((byte) 2345);
	a.add((byte) 5322);
	a.add((byte) 112);
	a.add(2,(byte) 24);
	System.out.println(a);
	Vector<Byte> b=new Vector<Byte>();
	b.add((byte) 67);
	b.add((byte) 90);
	b.add((byte) 454);
	b.add((byte) 4456);
	System.out.println(b);
	a.addAll(b);
	a.addAll(3,b);
	a.remove(2);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains((byte) 24));
	System.out.println(a.get(2));
	for(byte b1:a)
	{
		System.out.println(b1);
	}
	
	
}
}
