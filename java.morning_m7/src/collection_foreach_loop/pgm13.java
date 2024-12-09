package collection_foreach_loop;

import java.util.PriorityQueue;

public class pgm13 
{
public static void main(String[] args)
{
	PriorityQueue p=new PriorityQueue();
	p.add("place");
	p.add("home");
	p.add("village");
	p.add("year");
	System.out.println(p);
	p.add("planet");
	System.out.println(p);
	for (Object o:p)
	{
		System.out.println(o);
	}
	
}
}
