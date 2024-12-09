package practice_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class prgm21 
{
public static void main(String[] args) 
{
	LinkedList<Long> a=new LinkedList<Long>();
	a.add(10l);
	a.add(20l);
	a.add(35l);
	a.add(2,32l);
	System.out.println(a);
	LinkedList<Long> b=new LinkedList<Long>();
	b.add(45l);
	b.add(34l);
	b.add(54l);
	b.add(0,40l);
	System.out.println(b);
	a.addAll(b);
	a.addAll(1,b);
	a.remove(0);
	a.removeAll(b);
	System.out.println(a.size());
	System.out.println(a.contains(3));
	System.out.println(a.get(1));
	System.out.println(a);
	for( Long l:a)
	{
		System.out.println(l);
		
}

}
}
