package practice_collection;

import java.util.ArrayList;
import java.util.Collection;

public class prgm6 
{
public static void main(String[] args) 
{
	ArrayList<Short> a=new ArrayList<Short>();
	a.add((short) 10);
	a.add((short) 20);
	a.add((short) 30);
	a.add(2,(short) 32);
	ArrayList<Short> b=new ArrayList<Short>();
	b.add((short) 455);
	b.add((short) 34);
	b.add((short) 456);
	b.add(0,(short) 40);
	a.addAll(b);
	a.addAll(1,b);
	a.remove(0);
	a.removeAll(b);
System.out.println(a.size());
System.out.println(a.contains(12));
System.out.println(a.get(1));
System.out.println(a);
for( Short c:a)
{
	System.out.println(c);
			
}
	
}

}

