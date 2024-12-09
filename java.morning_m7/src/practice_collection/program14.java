package practice_collection;

import java.util.PriorityQueue;

public class program14 
{
public static void main(String[] args) 
{
	PriorityQueue p=new PriorityQueue();
	p.add("place");
	p.add("date");
	p.add("month");
	p.add("year");
	p.add("planet");
	PriorityQueue p1=new PriorityQueue();
	p1.add("hospital");
	p1.add("twentyfive");
	p1.add("july");
	p1.add("twentyone");
	p1.add("mercury");
	p.addAll(p1);
	System.out.println(p);
	System.out.println(p1);
}
}
