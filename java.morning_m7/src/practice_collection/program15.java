package practice_collection;

import java.util.PriorityQueue;

public class program15 
{
public static void main(String[] args) 
{
	PriorityQueue p=new PriorityQueue();
	p.add("jacky");
	p.add("lake");
	p.add("cake");
	p.add("ice");
	p.add("cone");
	p.remove(0);
	System.out.println(p);
	PriorityQueue p1=new PriorityQueue();
	p1.add("choco");
	p1.add("clane");
	p1.add("cycle");
	p1.add("bike");
	p1.add("car");
	p.addAll(p1);
	p.removeAll(p1);
	System.out.println(p);
}
}
