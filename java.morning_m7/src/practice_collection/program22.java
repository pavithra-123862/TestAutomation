
package practice_collection;

import java.util.LinkedHashSet;

public class program22 
{
public static void main(String[] args) 
{
	LinkedHashSet h=new LinkedHashSet();
	h.add(46.4);
	h.add('a');
	h.add(100);
	h.add("method");
	h.add("variable");
	LinkedHashSet h1=new LinkedHashSet();
	h1.add(29);
	h1.add(46.4);
	h1.add(100);
	h1.add("rupees");
	h1.add("crores");
	h.addAll(h1);
	System.out.println(h);
	System.out.println(h1);
	
}
}
