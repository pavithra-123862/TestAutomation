package practice_collection;

import java.util.Vector;

public class program7
{
public static void main(String[] args) 
{
	Vector a=new Vector();
	a.add(10);
	a.add('h');
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
}
}
