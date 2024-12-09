package collection_foreach_loop;

import java.util.TreeSet;

public class pgm25 
{
public static void main(String[] args)
{
	TreeSet h=new TreeSet();
	h.add(10);
	h.add(100);
	h.add(4567);
	h.add(7654);
	h.add(4545644);
	h.add(4565);
	h.add(2334);
	System.out.println(h);
	
	for (Object o:h)
	{
		System.out.println(o);
	}
}
}
