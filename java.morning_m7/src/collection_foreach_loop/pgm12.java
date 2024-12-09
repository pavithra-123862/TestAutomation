package collection_foreach_loop;

import java.util.LinkedList;

public class pgm12 
{
public static void main(String[] args) 
	{LinkedList l=new LinkedList();
	l.add("bng");
	l.add("china");
	l.add("amhd");
	l.add(20);
	l.add('g');
	l.add("whwre");
	boolean b= l.contains(10);
	System.out.println(b);
	int size=l.size();
	System.out.println(size);
	Object o = l.get(4);
	System.out.println(o);
	System.out.println(l);
	for (Object o1:l)
	{
		System.out.println(o1);
	}
	
	
}
}
