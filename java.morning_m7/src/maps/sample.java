package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class sample 
{

public static void main(String[] args) 
{
	String s="pavithra";
	char[] ch=s.toCharArray();
	LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
	for(int i=0;i<ch.length;i++)
	{ 
		char c=ch[i];
		
		if (!l.containsKey(c)) 
		{
			l.put(c, 1);
		}
		else
		{
			int count=l.get(c);
			count++;
			l.put(c, count);
		}
	}
	for(Entry<Character, Integer> o:l.entrySet())
	{
	System.out.println(o.getKey()+" "+o.getValue());
	}
}
}
