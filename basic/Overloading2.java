class Overloading2 
{
	static void m1(int i,float f)
	{
		System.out.println("anand singh");
	}
	static void m1(float f,int i)
	{
		System.out.println("sintu singh");
	}
	public static void main(String[] args) 
	{
		Overloading1 O=new Overloading1();
		m1(10,10.0f);// anand singh
		m1(10.0f,10);// sintu singh
	//	m1(10,10);// errer as ambigous
	}
}