package exception;

public class Mother 
{
public static void main(String[] args) 
{
	try {
		int a=1/0;
		System.out.println(a);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("done");
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught");
	}
}
}
