package collection_foreach_loop;

import java.util.LinkedHashSet;

public class pgm24 
{
public static void main(String[] args) 
{
	LinkedHashSet h=new LinkedHashSet();
	h.add(46);
	h.add('h');
	h.add("foam");
	h.add("france");
	h.add("paris");
	boolean b= h.contains(0);
	System.out.println(b);
	int size=h.size();
	System.out.println(size);
	for (Object o:h)
	{
		System.out.println(o);
	}
	
}

}
