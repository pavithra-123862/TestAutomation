package collection_foreach_loop;

import java.util.TreeSet;

public class pgm28 
{
public static void main(String[] args) 
{
	TreeSet t=new TreeSet();
	t.add(46);
	t.add(356);
	t.add(5635);
	t.add(454343);
	t.add(434554);
	boolean b= t.contains(20);
	System.out.println(b);
	int size=t.size();
	System.out.println(size);
	System.out.println(t);
	for (Object o:t)
	{
		System.out.println(o);
	}
}
}
