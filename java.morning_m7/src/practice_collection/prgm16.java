package practice_collection;


import java.util.Vector;

public class prgm16 
{
public static void main(String[] args) 
{
	Vector<Boolean> a=new 	Vector<Boolean>();
	a.add(true);
	a.add(true);
	a.add(false);
	a.add(true);
	System.out.println(a);
	Vector<Boolean> a1=new 	Vector<Boolean>();
	a1.add(true);
	a1.add(false);
	a1.add(true);
	a1.add(true);
	System.out.println(a1);
	a.addAll(1,a1);
	a.addAll(a1);
	a.remove(1);
	System.out.println(a);
    System.out.println(a.size());
    System.out.println(a.contains(true));
    System.out.println(a.get(1));
    for( Boolean b1:a)
    {
    	System.out.println(b1);
    			
    }
	
}
}
