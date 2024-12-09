package practice_collection;

import java.util.ArrayList;

public class prgm2 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a=new ArrayList<Character>();
		a.add('1');
		a.add('0');
		a.add('a');
		a.add(1,'4');
		System.out.println(a);
		ArrayList<Character> b=new ArrayList<Character>();
		b.add('h');
		b.add('6');
		b.add('8');
		b.add('4');
		b.add(3,'7');
		System.out.println(b);
		a.addAll(b);
		a.addAll(3,b);
		a.remove(0);
		a.removeAll(b);
		System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(12));
	System.out.println(a.get(1));
	
	for( Character c:a)
	{
		System.out.println(c);
				
	}
	
}
}

