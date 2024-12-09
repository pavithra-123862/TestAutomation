package practice_collection;

import java.util.ArrayList;

public class program2 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(20);
		a.add("byee");
		a.add('B');
		ArrayList b=new ArrayList();
		b.add(20);
		b.add('A');
		b.add("hii");
		a.addAll(2,b);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
