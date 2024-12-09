package practice_collection;

import java.util.HashSet;
import java.util.PriorityQueue;

public class prgm39 
{
	public static void main(String[] args) 
	{
		HashSet<Character> a=new HashSet<Character>();
		a.add('1');
		a.add('0');
		a.add('a');
		a.add('4');
		System.out.println(a);
		HashSet<Character> b=new HashSet<Character>();
		b.add('h');
		b.add('6');
		b.add('8');
		b.add('4');
		b.add('7');
		System.out.println(b);
		a.addAll(b);
		a.addAll(b);
		a.remove(0);
		a.removeAll(b);
		System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(12));

	for( Character c:a)
	{
		System.out.println(c);
	}
	}
}
