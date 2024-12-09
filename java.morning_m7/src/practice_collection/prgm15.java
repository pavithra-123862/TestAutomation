package practice_collection;

import java.util.Vector;

public class prgm15 
{
public static void main(String[] args) 
{
	Vector<Character> a=new Vector<Character>();
	a.add('1');
	a.add('0');
	a.add('a');
	a.add(1,'4');
	Vector<Character> b=new Vector<Character>();
	b.add('h');
	b.add('6');
	b.add('8');
	b.add('4');
	b.add(3,'7');
	System.out.println(b);
	a.addAll(b);
	a.addAll(2,b);
	a.remove(0);
	a.removeAll(b);
System.out.println(a.size());
System.out.println(a.contains(8));
System.out.println(a.get(1));
System.out.println(a);
for( Character c:a)
{
	System.out.println(c);
			
}

}
}
