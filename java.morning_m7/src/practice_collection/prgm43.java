package practice_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class prgm43 
{
public static void main(String[] args) 
{

	LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
	a.add(10);
	a.add(20);
	a.add(46);
	a.add(2);
	System.out.println(a);
	LinkedHashSet<Integer> b=new LinkedHashSet<Integer>();
	b.add(20);
	b.add(49);
	b.add(1);
	System.out.println(b);
	a.addAll(b);
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
