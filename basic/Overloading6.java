class Overloading6 
{
	static void m1(StringBuffer SB)
	{
		System.out.println("this is String Buffer");
	}
	static void m1(String S)
	{
		System.out.println("this is the string ");
	}

	public static void main(String[] args) 
	{
		Overloading6 O=new Overloading6();
		O.m1("java");
		O.m1("this is too print");
		//O.m1(null); error is ambigious.
	}
}
