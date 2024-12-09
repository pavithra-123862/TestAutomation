package collection_foreach_loop;

import java.util.LinkedHashSet;

public class pgm21 
{
public static void main(String[] args) 
{
	LinkedHashSet l=new LinkedHashSet();
	l.add(467.4);
	l.add('a');
	l.add(20);
	l.add("double");
	l.add("char");
	l.add(46.4);
	l.add('a');
	System.out.println(l);
	System.out.println(l);
	for (Object o:l)
	{
		System.out.println(o);
	}
}

}
