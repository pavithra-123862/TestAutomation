package practice_collection;


import java.util.TreeSet;

public class prgm51 
{

public static void main(String[] args)//TODO auto-generated  method stub
{
    TreeSet<Double> a=new TreeSet<Double>();
	  a.add(23.3);
	  a.add(2.32);
	  a.add(2.4);
	  System.out.println(a);
	  TreeSet<Double> b=new TreeSet<Double>();
	  b.add(21.3);
	  b.add(1.34);
	  b.add(12.34);
	  b.add(1.3);
	  System.out.println(b);
	  a.addAll(b);
	  a.removeAll(b);
	  System.out.println(a);
	  System.out.println(a.contains(2.0));
	 
	  for( double d:a)
	  {
		  System.out.println(d);
	  }
}
}
