package practice_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class prgm44 
{
public static void main(String[] args) 
{
	LinkedHashSet<Long> a=new LinkedHashSet<Long>();
	a.add(10l);
	a.add(20l);
	a.add(35l);
	a.add(32l);
	System.out.println(a);
	LinkedHashSet<Long> b=new LinkedHashSet<Long>();
	b.add(45l);
	b.add(34l);
	b.add(54l);
	b.add(40l);
	System.out.println(b);
	a.addAll(b);
	a.addAll(b);
	a.remove(0);
	a.removeAll(b);
	System.out.println(a.size());
	System.out.println(a.contains(3));
	System.out.println(a);
	for( Long l:a)
	{
		System.out.println(l);
		
}
}
}
