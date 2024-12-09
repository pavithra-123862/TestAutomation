package collection_foreach_loop;

import java.util.Vector;

public class pgm6 
{
public static void main(String[] args) 
{
	Vector a=new Vector();
	a.add(10);
	a.add("when");
	a.add("where");
	Vector b=new Vector();
	b.add(20);
	b.add("soon");
	b.add("see u");
	b.addAll(0,b);
	System.out.println(a);
	System.out.println(b);
	for (Object o:a)
	{
		System.out.println(o);
	}
	
}
}
