package practice_collection;

import java.util.HashSet;

public class program20 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46);
	h.add('f');
	h.add("fine");
	h.add("true");
	h.add("boolean");
	boolean b= h.contains(20);
	System.out.println(b);
	int size=h.size();
	System.out.println(size);
	
}
}
