package practice_collection;
import java.util.LinkedList;

public class program10
{
public static void main(String[] args) 
{
	LinkedList l=new LinkedList();
	l.add("pavi");
	l.add("gani");
	l.add("usha");
	l.add("raj");
	l.add("hima");
	LinkedList l1=new LinkedList();
	l1.add("kavya");
	l1.add("harshi");
	l1.add("vishu");
	l1.add("santu");
	l1.add("bags");
	l.addAll(4,l1);
	System.out.println(l);
	System.out.println(l1);
	
	
}
}
