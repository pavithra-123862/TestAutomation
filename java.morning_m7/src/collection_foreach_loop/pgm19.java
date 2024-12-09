package collection_foreach_loop;

import java.util.HashSet;

public class pgm19 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46);
	h.add('f');
	h.add("fine");
	h.add("good");
	h.add("boolean");
	h.remove(0);
	System.out.println(h);
	HashSet h1=new HashSet();
	h1.add(29);
	h1.add(20.5);
	h1.add("bad");
	h1.add("rupees");
	h1.add("dollers");
	h.addAll(h1);
	h.removeAll(h1);
	System.out.println(h);
	for (Object o:h)
	{
		System.out.println(o);
	}
	
}
}
