class Overloading4 
{
	static void m1(int i)
	{
		System.out.println("this is int ");
	}
	static void m1(int ... x)
	{
		System.out.println("this is var args");
	}

	public static void main(String[] args) 
	{
		Overloading4 O=new Overloading4();
		O.m1();
		O.m1(1,2,3,4,5,6);
		O.m1(1);
	}
}
