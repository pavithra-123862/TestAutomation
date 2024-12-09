package collection_foreach_loop;

import java.util.LinkedList;

public class pgm9 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("pavi");
		l.add("gani");
		l.add("when");
		l.add("raj");
		l.add("hima");
		System.out.println(l);
		l.add(4,"hii");
		System.out.println(l);
		for (Object o:l)
		{
			System.out.println(o);
		}
		
		
}
}
