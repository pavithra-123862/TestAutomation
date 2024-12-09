package collection_foreach_loop;

import java.util.ArrayList;

public class pgm4 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add(5656);
	a.add(200);
	a.add(37545);
	a.add(370);
	a.add(189);
	a.add(2455);
	boolean b= a.contains(5);
	System.out.println(b);
	int size=a.size();
	System.out.println(size);
	Object o = a.get(4);
	System.out.println(o);
	System.out.println(a);
	for (Object o1:a)
	{
		System.out.println(o1);
	}
}
}
