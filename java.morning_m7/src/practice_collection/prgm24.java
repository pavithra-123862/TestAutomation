package practice_collection;

import java.util.LinkedList;
import java.util.Vector;

public class prgm24 
{
public static void main(String[] args)
{
	LinkedList<Boolean> a=new LinkedList<Boolean>();
	a.add(true);
	a.add(true);
	a.add(false);
	a.add(true);
	System.out.println(a);
	LinkedList<Boolean> b=new 	LinkedList<Boolean>();
	b.add(true);
	b.add(false);
	b.add(true);
	b.add(true);
	System.out.println(b);
	a.addAll(1,b);
	a.addAll(b);
	a.remove(1);
	System.out.println(a);
    System.out.println(a.size());
    System.out.println(a.contains(true));
    System.out.println(a.get(0));
    for( Boolean b1:a)
    {
    	System.out.println(b1);
    			
    }
	
    }
	
}
