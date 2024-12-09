package practice_collection;

import java.util.ArrayList;

public class prgm5
{
public static void main(String[] args) 
{
	ArrayList<Byte> a=new ArrayList<Byte>();
	a.add((byte) 10232);
	a.add((byte) 2023);
	a.add((byte) 3034);
	a.add(2,(byte) 3235);
	System.out.println(a);
	ArrayList<Byte> b=new ArrayList<Byte>();
	b.add((byte) 455);
	b.add((byte) 3445);
	b.add((byte) 456);
	b.add(0,(byte) 4076);
	System.out.println(b);
	a.addAll(b);
	a.addAll(0,b);
	a.remove(0);
	a.removeAll(b);
System.out.println(a.size());
System.out.println(a.contains(12));
System.out.println(a.get(0));
System.out.println(a);
for( Byte c:a)
{
	System.out.println(c);
			
}
	
}

}

