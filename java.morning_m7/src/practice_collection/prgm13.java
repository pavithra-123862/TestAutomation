package practice_collection;

import java.util.Vector;

public class prgm13 
{
	public static void main(String[] args) 
	{
		Vector<Float> a=new Vector<Float>();
		a.add(234f);
		a.add(2345f);
		a.add(5322f);
		a.add(112f);
		a.add(0,24254f);
		System.out.println(a);
		Vector<Float> b=new Vector<Float>();
		b.add(6778f);
		b.add(45690f);
		b.add(454678f);
		b.add(4456f);
		System.out.println(b);
		a.addAll(b);
		a.addAll(2,b);
		a.remove(b);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(15));
		System.out.println(a.get(2));
		for(float b1:a)
		{
			System.out.println(b1);
		}
	
}
}
