package practice_collection;

import java.util.Vector;

public class program6 
{
public static void main(String[] args) 
{
	Vector a=new Vector();
	a.add(10);
	a.add('h');
	a.add("hiii");
	Vector b=new Vector();
	b.add(20);
	b.add('d');
	b.add("see u");
	b.addAll(1,b);
	System.out.println(a);
	System.out.println(b);
			
}
}
