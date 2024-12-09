package practice_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class prgm42
{
public static void main(String[] args) 
{
	LinkedHashSet<Short> a=new LinkedHashSet<Short>();
	a.add((short) 10);
	a.add((short) 20);
	a.add((short) 30);
	a.add((short) 32);
	LinkedHashSet<Short> b=new LinkedHashSet<Short>();
	b.add((short) 455);
	b.add((short) 34);
	b.add((short) 456);
	b.add((short) 40);
	a.addAll(b);
	a.addAll(b);
	a.remove(0);
	a.removeAll(b);
	System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains(12));

for( Short c:a)
{
	System.out.println(c);
			
}
}
}
