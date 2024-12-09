package collection_foreach_loop;

import java.util.HashSet;

public class pgm18 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46.4);
	h.add('a');
	h.add("spider");
	h.add("char");
	h.add("string");
	HashSet h1=new HashSet();
	h1.add(29);
	h1.add(20.5);
	h1.add(1000);
	h1.add("million");
	h1.add("dollers");
	h.addAll(h1);
	System.out.println(h);
	System.out.println(h1);
	for (Object o:h)
	{
		System.out.println(o);
	}
	
}
}
