package typecasting;

 class Sample {
	int a=40;
	}
	class Demo extends Sample
	{
		void disp()
		{
			System.out.println("hi");
		}
	}
	class Mainclass
	{
		public static void main(String[] args) 
		{
			Sample s=new Demo();
			System.out.println(s.a);
			Demo d=(Demo)s;
			System.out.println(d.a);
			d.disp();
		}

}
