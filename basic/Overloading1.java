class Overloading1 
{
	static void m1(int i)
	{
		System.out.println("madhuwala");
	}
	static void m1(float F)
	{
		System.out.println("sania banu");
	}
	public static void main(String[] args) 
	{
		Overloading1 O=new Overloading1();
		m1(10);// op : madhubala
		m1(10.5f);// op : sania banu 
	}
}
