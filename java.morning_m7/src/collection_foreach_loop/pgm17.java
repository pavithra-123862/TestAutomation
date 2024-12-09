package collection_foreach_loop;

import java.util.HashSet;

public class pgm17 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46.4);
	h.add('g');
	h.add("global");
	h.add("true");
	h.add("local");
	h.add(296656);
	h.add(20.5);
	System.out.println(h);
	for (Object o:h)
	{
		System.out.println(o);
	}
	
}
}
