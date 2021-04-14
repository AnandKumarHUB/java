class A
{
	int i;
	void m1()
	{
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
}
class Test1
{
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.i=100;
		A obj2=new A();
		obj2.i=200;
		obj1.m1();
		obj2.m1();
}