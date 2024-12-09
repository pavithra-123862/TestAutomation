package string_class;

class Father 
{
public static void main(String[] args) 
{
	String s1="hello";
	String s2="byee";
	System.out.println((s1==s2));
	String s3=new String("hello");
	String s4=new String("hello");
	System.out.println(s3.equals(s4));
}
}
