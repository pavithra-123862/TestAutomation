package collection_foreach_loop;

import java.util.PriorityQueue;

public class pgm14 
{
public static void main(String[] args) 
{
	PriorityQueue p=new PriorityQueue();
	p.add("place");
	p.add("night");
	p.add("month");
	p.add("year");
	p.add("planet");
	PriorityQueue p1=new PriorityQueue();
	p1.add("home");
	p1.add("venue");
	p1.add("july");
	p1.add("day");
	p1.add("daily");
	p.addAll(p1);
	System.out.println(p);
	System.out.println(p1);
	for (Object o:p)
	{
		System.out.println(o);
	}
	
}
}
