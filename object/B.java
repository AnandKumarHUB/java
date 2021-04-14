class B
{
	int i=3;
	static void m1()
	{
		System.out.println(i);
	}
	void m2()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		m1();
		B obj=new B();
		obj.m2();
	}
}
