package exception;

public class Sister 
{
public static void main(String[] args) 
{
	try
	{
		int a=1/0;
		System.out.println(a);
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught");
	}
}
}
