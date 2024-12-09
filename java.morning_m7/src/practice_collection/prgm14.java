package practice_collection;

import java.util.Vector;

public class prgm14 
{
 public static void main(String[] args) 
 {
	 Vector<Double> a=new Vector<Double>();
		a.add(23d);
		a.add(234d);
		a.add(532267d);
		a.add(11245d);
		a.add(2,24254d);
		System.out.println(a);
		Vector<Double> b=new Vector<Double>();
		b.add(6778d);
		b.add(45690d);
		b.add(454567d);
		b.add(445632d);
		System.out.println(b);
		a.addAll(b);
		a.addAll(1,b);
		a.remove(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(19));
		System.out.println(a.get(2));
		for(double b1:a)
		{
			System.out.println(b1);
		}
	
}
}
