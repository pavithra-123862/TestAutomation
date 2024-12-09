package practice_collection;

import java.util.ArrayList;

public class prgm1 
{
public static void main(String[] args) 
{
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(2,32);
	System.out.println(a);
	ArrayList<Integer> b=new ArrayList<Integer>();
	b.add(455);
	b.add(34);
	b.add(456);
	b.add(0,40);
	System.out.println(b);
	a.addAll(b);
	a.addAll(0,b);
	a.remove(0);
	a.removeAll(b);
	System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains(12));
System.out.println(a.get(1));
for( Integer c:a)
{
	System.out.println(c);
			
}
	
}
}


