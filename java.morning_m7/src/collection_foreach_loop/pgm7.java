package collection_foreach_loop;

import java.util.Vector;

public class pgm7
{
public static void main(String[] args) 
{
	Vector a=new Vector();
	a.add(10);
	a.add("soon");
	a.add("hiii");
	a.remove(0);
	System.out.println(a);
	Vector b=new Vector();
	b.add(20);
	b.add('d');
	b.add("see u");
	b.addAll(b);
	a.removeAll(b);
	System.out.println(a);
	for (Object o:a)
	{
		System.out.println(o);
	}
}
}
