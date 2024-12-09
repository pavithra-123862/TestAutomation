package iib;

public class Sample1 {
	public Sample1()
	{
		System.out.println("hey im constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		new Sample1();
		System.out.println("main ends");
	}
	{
		System.out.println("hey im iib");
	}
	static
	{
		System.out.println("hey im sib");
	}

}
