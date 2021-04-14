class Overloading5 
{
	static void m1(Object O)
	{
		System.out.println("this is the object");
	}
	static void m1(String S)
	{
		System.out.println("this is the String");
	}
	public static void main(String[] args) 
	{
	Overloading5 O=new Overloading5();
	O.m1(new Object());
	O.m1(" this is same String");
	O.m1(null);
	}
}
