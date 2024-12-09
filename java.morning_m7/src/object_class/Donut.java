package object_class;

public class Donut 
{
	public int hashcode()
	{
		return 123456;
	}
	
public static void main(String[] args) 
{
	Donut d1=new Donut();
	System.out.println(d1.hashcode());
	Donut d2=new Donut();
	System.out.println(d2.hashcode());
} 

}
