package practice_collection;

import java.util.HashSet;

public class program18 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46.4);
	h.add('a');
	h.add("false");
	h.add("true");
	h.add("boolean");
	HashSet h1=new HashSet();
	h1.add(29);
	h1.add(20.5);
	h1.add(1000);
	h1.add("rupees");
	h1.add("dollers");
	h.addAll(h1);
	System.out.println(h);
	System.out.println(h1);
	
}
}
