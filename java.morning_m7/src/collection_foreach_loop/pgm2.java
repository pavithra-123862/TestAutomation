package collection_foreach_loop;

import java.util.ArrayList;

public class pgm2 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add(5656);
	a.add(200);
	a.add(37545);
	a.add(370);
	ArrayList a1=new ArrayList();
	a1.add(189);
	a1.add(2455);
	a1.add(4354);
	a1.add(3233);
	a.addAll(a1);
	a.addAll(1,a1);
	System.out.println(a);
	for (Object o:a)
	{
		System.out.println(o);
	}
}
}
