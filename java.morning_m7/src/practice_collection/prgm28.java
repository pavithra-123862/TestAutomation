package practice_collection;


import java.util.PriorityQueue;

public class prgm28 
{
public static void main(String[] args) 
{
	PriorityQueue<Character> a=new PriorityQueue<Character>();
	a.add('1');
	a.add('0');
	a.add('a');
	a.add('4');
	System.out.println(a);
	PriorityQueue<Character> b=new PriorityQueue<Character>();
	b.add('h');
	b.add('6');
	b.add('8');
	b.add('4');
	b.add('7');
	System.out.println(b);
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












