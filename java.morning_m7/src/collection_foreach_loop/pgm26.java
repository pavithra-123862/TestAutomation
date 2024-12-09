package collection_foreach_loop;

import java.util.TreeSet;

public class pgm26 
{
public static void main(String[] args) 
{
	TreeSet h=new TreeSet();
	h.add(464);
	h.add(458);
	h.add(452564);
	h.add(23345);
	h.add(6566756);
	TreeSet h1=new TreeSet();
	h1.add(29);
	h1.add(2056);
	h1.add(1000);
	h1.add(4475);
	h1.add(357576);
	h.addAll(h1);
	System.out.println(h);
	System.out.println(h1);
	for (Object o:h)
	{
		System.out.println(o);
	}
}
}
