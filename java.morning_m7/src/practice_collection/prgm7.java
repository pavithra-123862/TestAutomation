
package practice_collection;

import java.util.ArrayList;

import org.hamcrest.core.StringContains;

public class prgm7 
{
public static void main(String[] args) 
{
  ArrayList<Double> a=new ArrayList<Double>();
  a.add(23.3d);
  a.add(234.334d);
  a.add(2342.32);
  a.add(2.234d);
  a.add(2,23.4567d);
  ArrayList<Double> b=new ArrayList<Double>();
  b.add(21.34d);
  b.add(1.34d);
  b.add(12.344d);
  b.add(133.3344d);
  a.addAll(b);
  a.addAll(2,b);
  a.remove(0);
  a.removeAll(b);
  System.out.println(a.size());
  System.out.println(a.contains(14));
  System.out.println(a.get(3));
  System.out.println(a);
  for( double d:a)
  {
	  System.out.println(d);
  
  
}


}
}
