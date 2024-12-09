package practice_collection;

import java.util.LinkedList;

public class program11 
{
public static void main(String[] args) 
{
	LinkedList l=new LinkedList();
	l.add("who");
	l.add("why");
	l.add("when");
	l.add("how");
	l.remove(0);
	System.out.println(l);
	LinkedList l1=new LinkedList();
	l1.add("kavya");
	l1.add("harshi");
	l1.add("vishu");
	l1.add("santu");
	l1.add("bags");
	l.addAll(2,l1);
	l.removeAll(l1);
	System.out.println(l);
}
}
