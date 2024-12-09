package practice_collection;

import java.util.LinkedHashSet;

public class program23 
{
public static void main(String[] args) 
{
	LinkedHashSet h=new LinkedHashSet();
	h.add(46);
	h.add('f');
	h.add("worst");
	h.add("not bad");
	h.add("string");
	h.remove(0);
	System.out.println(h);
	LinkedHashSet h1=new LinkedHashSet();
	h1.add(29);
	h1.add(20.5);
	h1.add("good");
	h1.add("coins");
	h1.add("millions");
	h.addAll(h1);
	h.removeAll(h1);
	System.out.println(h);
}
}
