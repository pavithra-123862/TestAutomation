package practice_collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prgm26 
{
public static void main(String[] args)
{
	PriorityQueue<Short> a=new PriorityQueue<Short>();
	a.add((short) 10);
	a.add((short) 20);
	a.add((short) 30);
	a.add((short) 32);
	PriorityQueue<Short> b=new PriorityQueue<Short>();
	b.add((short) 455);
	b.add((short) 34);
	b.add((short) 456);
	b.add((short) 40);
	a.addAll(b);
	a.remove(0);
	a.removeAll(b);
	System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains(12));

for( Short c:a)
{
	System.out.println(c);
			
}
}
}
