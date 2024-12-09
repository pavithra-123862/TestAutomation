package typecasting;

 class Cool
{
	void fo()
	{
		System.out.println("chill");
	}
}
class Hot extends Cool
{
	void ho()
	{
		System.out.println("fire");
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Cool c=new Hot();
		c.fo();
		Hot h=(Hot)c;
		h.ho();
		h.fo();
	}

}
