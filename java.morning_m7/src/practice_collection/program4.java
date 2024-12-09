package practice_collection;

import java.util.ArrayList;

public class program4 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add("10");
	a.add('A');
	a.add("Hii");
	a.add(20);
	a.add('B');
	a.add("byeee");
	boolean b= a.contains(5);
	System.out.println(b);
	int size=a.size();
	System.out.println(size);
	Object o = a.get(4);
	System.out.println(o);
	
}
}
