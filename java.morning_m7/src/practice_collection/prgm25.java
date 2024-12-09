package practice_collection;


import java.util.PriorityQueue;

public class prgm25 
{
public static void main(String[] args) 
{
	PriorityQueue<Byte> a=new PriorityQueue<Byte>();
	a.add((byte)10);
	a.add((byte)20);
	a.add((byte)46);
	a.add((byte)49);
	System.out.println(a);
	PriorityQueue<Byte> b=new PriorityQueue<Byte>();
	b.add((byte)20);
	b.add((byte)49);
	b.add((byte)50);
	System.out.println(b);
	a.addAll(b);
	a.remove(2);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(20));
	for(byte b1:a)
	{
		System.out.println(b1);
	}
}
}
