package abstract_class;

abstract class Sample
{
	 abstract void fo();
	 abstract void ho();
}
class Demo extends Sample
{
	void fo()
	{
		System.out.println("hello");
	}
	void ho()
	{
		System.out.println("hi");
	}
}
class Mainclass
{
 public static void main(String[] args) 
  {
	Demo d=new Demo();
	d.ho();
	d.fo();
  }
}
