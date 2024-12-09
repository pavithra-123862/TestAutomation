package practice_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class pgrm22
{
public static void main(String[] args) 
{
	LinkedList<Float> a=new LinkedList<Float>();
	a.add(10f);
	a.add(20f);
	a.add(30f);
	a.add(2,32f);
	 System.out.println(a);
	LinkedList<Float> b=new LinkedList<Float>();
	b.add(455f);
	b.add(34f);
	b.add(45f);
	b.add(0,40f);
	 System.out.println(b);
	a.addAll(b);
	a.addAll(3,b);
	a.remove(0);
	a.removeAll(b);
	 System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains(16));
System.out.println(a.get(1));

for( Float f:a)
{
	System.out.println(f);
			
}
}
}
