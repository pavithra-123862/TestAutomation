package collection_foreach_loop;

import java.util.PriorityQueue;

public class pgm15 
{
public static void main(String[] args) 
{
	PriorityQueue p=new PriorityQueue();
	p.add("sun");
	p.add("star");
	p.add("cake");
	p.add("ice");
	p.add("cone");
	p.remove(0);
	System.out.println(p);
	PriorityQueue p1=new PriorityQueue();
	p1.add("choco");
	p1.add("moon");
	p1.add("cloud");
	p1.add("bike");
	p1.add("car");
	p.addAll(p1);
	p.removeAll(p1);
	System.out.println(p);
	for (Object o:p)
	{
		System.out.println(o);
	}
	
}
}
