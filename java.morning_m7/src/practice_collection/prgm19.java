
package practice_collection;

import java.util.LinkedList;

public class prgm19 
{
public static void main(String[] args) 
{
	LinkedList<Integer> a=new LinkedList<Integer>();
	a.add(10);
	a.add(20);
	a.add(46);
	a.add(2,49);
	System.out.println(a);
	LinkedList<Integer> b=new LinkedList<Integer>();
	b.add(20);
	b.add(49);
	b.add(1,50);
	System.out.println(b);
	a.addAll(b);
	a.addAll(3,b);
	a.remove(2);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(20));
	System.out.println(a.get(1));
	for(Integer i:a)
	{
		System.out.println(i);
    }
}
}
