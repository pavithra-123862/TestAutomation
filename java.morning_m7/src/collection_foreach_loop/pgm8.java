package collection_foreach_loop;

import java.util.Vector;

public class pgm8 
{
public static void main(String[] args)
{
	Vector a=new Vector();
    a.add(10);
    a.add('m');
	a.add("good");
	a.add(20);
	a.add("byee");
	a.add("catch u");
	 boolean b= a.contains(10);
	 System.out.println(b);
	 int size=a.size();
	 System.out.println(size);
	 Object o= a.get(5);
	 System.out.println(o);
	 System.out.println(a);
	 for (Object o1:a)
		{
			System.out.println(o1);
		}
}

}
