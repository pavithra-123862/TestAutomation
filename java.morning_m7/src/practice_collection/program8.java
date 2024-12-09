
package practice_collection;

import java.util.Vector;

public class program8 
{
public static void main(String[] args) 
{
	Vector a=new Vector();
    a.add(10);
    a.add('m');
	a.add("good byee");
	a.add(20);
	a.add('g');
	a.add("catch u");
	 boolean b= a.contains(10);
	 System.out.println(b);
	 int size=a.size();
	 System.out.println(size);
	 Object o= a.get(5);
	 System.out.println(o);
}
}
