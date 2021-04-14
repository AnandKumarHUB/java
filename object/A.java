class z 
{
	  static int i=5;
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
		z obj1=new z();
		obj1.m2();
	}
}