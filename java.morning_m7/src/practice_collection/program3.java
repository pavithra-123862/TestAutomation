package practice_collection;

import java.util.ArrayList;

public class program3 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add(10);
	a.add('A');
	a.add("hii");
	a.remove(0);
	System.out.println(a);
	ArrayList b=new ArrayList();
	b.add(10);
	b.add('A');
	b.add("Hiii");
	a.addAll(a);
	a.removeAll(b);
	System.out.println(a);
}
}
