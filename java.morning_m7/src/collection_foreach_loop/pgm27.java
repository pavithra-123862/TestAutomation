package collection_foreach_loop;

import java.util.TreeSet;

public class pgm27 
{
public static void main(String[] args) 
{
	TreeSet t=new TreeSet();
	t.add(46);
	t.add(444);
	t.add(5667);
	t.add(465667);
	t.add(44345);
	t.remove(0);
	System.out.println(t);
	TreeSet t1=new TreeSet();
	t1.add(29);
	t1.add(205);
	t1.add(344456);
	t1.add(655443);
	t1.add(4446);
	t.addAll(t1);
	t.removeAll(t1);
	System.out.println(t);
	for (Object o:t)
	{
		System.out.println(o);
	}
}
}
