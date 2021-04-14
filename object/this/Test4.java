class B 
{
	int i;
	void m1()
	{
		System.out.println(i);
	}
	void m2()
	{
		this.m1();
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		B obj1=new B();
		obj1.i=10;
		obj1.m2();
	}
}
