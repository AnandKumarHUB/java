class Overloading3 
{
	static void m1(float F)
	{
		System.out.println("Anand");
	}
	static void m1(double F)
	{
	System.out.println("Anand Singh");
	}

	public static void main(String[] args) 
	{
		Overloading3 O=new Overloading3();
		m1(10.5f);
		m1(10.00);
	}
}