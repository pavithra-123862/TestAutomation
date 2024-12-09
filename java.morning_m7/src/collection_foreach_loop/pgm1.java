package collection_foreach_loop;

import java.util.ArrayList;

public class pgm1 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add(100);
	a.add(20);
	a.add(377);
	a.add(37);
	System.out.println(a);
	for (Object o:a)
	{
		System.out.println(o);
	}
	
}
}
