package collection_foreach_loop;

import java.util.LinkedList;

public class pgm10 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("pavi");
		l.add("gani");
		l.add("usha");
		l.add("raj");
		l.add("hima");
		LinkedList l1=new LinkedList();
		l1.add("kavya");
		l1.add("darshu");
		l1.add("vishu");
		l1.add("barath");
		l1.add("bags");
		l.addAll(4,l1);
		System.out.println(l);
		System.out.println(l1);
		 for (Object o:l)
			{
				System.out.println(o);
			}
			
}
}
