package practice_collection;

import java.util.ArrayList;

public class prgm3 
{
public static void main(String[] args)
{
	ArrayList<Float> a=new ArrayList<Float>();
	a.add(10f);
	a.add(20f);
	a.add(30f);
	a.add(2,32f);
	ArrayList<Float> b=new ArrayList<Float>();
	b.add(455f);
	b.add(34f);
	b.add(45f);
	b.add(0,40f);
	a.addAll(b);
	a.addAll(3,b);
	a.remove(0);
	a.removeAll(b);
System.out.println(a.size());
System.out.println(a.contains(20f));
System.out.println(a.get(1));
System.out.println(a);
for( Float c:a)
{
	System.out.println(c);
			
}
	
}

}

