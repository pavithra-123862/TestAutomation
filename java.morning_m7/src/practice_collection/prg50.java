package practice_collection;


import java.util.TreeSet;


public class prg50 
{
public static void main(String[] args) 
{
	TreeSet<Character> a=new TreeSet<Character>();
	a.add('1');
	a.add('0');
	a.add('a');
	a.add('4');
	System.out.println(a);
	TreeSet<Character> b=new TreeSet<Character>();
	b.add('h');
	b.add('6');
	b.add('8');
	b.add('4');
	b.add('7');
	System.out.println(b);
	a.addAll(b);
	a.addAll(b);
	a.remove('3');
	a.removeAll(b);
	System.out.println(a);
System.out.println(a.size());
System.out.println(a.contains('5'));

for( Character c:a)
{
	System.out.println(c);
}
}
}
