package Ref_variable;

public class Circle1 
{
	    static double area()
	    {
		final double pi=3.142;
		int r=5;
		double res=pi*r*r;
		return res;
	    }
	public static void main(String[] args) 
	{
		Circle C= new Circle();
		System.out.println(area());
	}

}
