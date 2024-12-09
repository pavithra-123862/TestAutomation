package exception;

public class Sample 
{
public static void main(String[] args) 
{
	try
	{
		Sample s=null;
		System.out.println(s.hashCode());
	}
	catch (NullPointerException a)
	{
		System.out.println("handled");
	}
}
}
