package practice_collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class prgm27 
{
public static void main(String[] args) 
{
	PriorityQueue<Integer> a=new PriorityQueue<Integer>();
	a.add(10);
	a.add(20);
	a.add(46);
	a.add(2);
	System.out.println(a);
	PriorityQueue<Integer> b=new PriorityQueue<Integer>();
	b.add(20);
	b.add(49);
	b.add(1);
	System.out.println(b);
	a.addAll(b);
	a.remove(2);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(20));
	for(Integer i:a)
	{
		System.out.println(i);
    }
}
}
