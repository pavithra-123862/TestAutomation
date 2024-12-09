package practice_collection;

import java.util.HashSet;

public class program19 
{
public static void main(String[] args) 
{
	HashSet h=new HashSet();
	h.add(46);
	h.add('f');
	h.add("fine");
	h.add("true");
	h.add("boolean");
	h.remove(0);
	System.out.println(h);
	HashSet h1=new HashSet();
	h1.add(29);
	h1.add(20.5);
	h1.add("bad");
	h1.add("rupees");
	h1.add("dollers");
	h.addAll(h1);
	h.removeAll(h1);
	System.out.println(h);
}
}
