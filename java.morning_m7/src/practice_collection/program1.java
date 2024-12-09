package practice_collection;

import java.util.ArrayList;

public class program1 
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList ();
	a.add(10);
	a.add('A');
	a.add("hi");
	a.add(true);
	System.out.println(a);
	a.add(2,"byee");
	System.out.println(a);
}
}
