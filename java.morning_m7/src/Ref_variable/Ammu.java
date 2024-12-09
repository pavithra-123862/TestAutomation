package Ref_variable;

public class Ammu {
	double area(int r)
	{
		final double pi=3.142;
		double res=pi*r*r;
	  return res;
	}
	public static void main(String[] args) 
	{
		Ammu A= new Ammu();
		  System.out.println(A.area(5));
	}

}
