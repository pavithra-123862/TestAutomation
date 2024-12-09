package collection_foreach_loop;

import java.util.PriorityQueue;

public class pgm16 
{
public static void main(String[] args) 
{
	PriorityQueue p=new PriorityQueue();
	p.add("jacky");
	p.add("lake");
	p.add("cake");
	p.add("ice");
	p.add("cone");
	boolean b= p.contains(10);
	System.out.println(b);
	int size=p.size();
	System.out.println(size);
	System.out.println(p);
	for (Object o:p)
	{
		System.out.println(o);
	}
	
}
}
