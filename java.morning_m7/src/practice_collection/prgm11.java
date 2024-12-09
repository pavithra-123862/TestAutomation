package practice_collection;

import java.util.Vector;

public class prgm11 
{
 public static void main(String[] args) 
 {
	 Vector<Integer> a=new Vector<Integer>();
		a.add(234);
		a.add(235);
		a.add(53);
		a.add(112);
		a.add(2,24);
		System.out.println(a);
		Vector<Integer> b=new Vector<Integer>();
		b.add(67);
		b.add(90);
		b.add(454);
		b.add(445);
		System.out.println(b);
		a.addAll(b);
		a.addAll(1,b);
		a.remove(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(5));
		System.out.println(a.get(0));
		for(Integer b1:a)
		{
			System.out.println(b1);
		}
		
	}		
}
