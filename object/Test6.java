class A
{
	int i;
	int j;
	void m1()
	{
		int i=0;
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.i);
	}
}
class Test6
{
	public static void main(String[] args) 
	{
	A obj1=new A();
	obj1.i=100;
	obj1.j=100;
	obj1.m1();

	}
}
