package practice_collection;

import java.util.PriorityQueue;

public class program16 
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
}

}
