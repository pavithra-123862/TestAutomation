package practice_collection;

import java.util.HashSet;
import java.util.PriorityQueue;

public class prgm37 
{
public static void main(String[] args) 
{
	HashSet<Float> a=new HashSet<Float>();
	a.add(10f);
	a.add(20f);
	a.add(30f);
	a.add(32f);
	 System.out.println(a);
	HashSet<Float> b=new HashSet<Float>();
	b.add(455f);
	b.add(34f);
	b.add(45f);
	b.add(40f);
	 System.out.println(b);
	a.addAll(b);
	a.addAll(b);
	a.remove(0);
	a.removeAll(b);
	 System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains(16));

for( Float f:a)
{
	System.out.println(f);
			
}
}
}
