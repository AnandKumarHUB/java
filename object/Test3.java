class A
{
	int i;
}
class Test3
{
	public static void main(String[] args) 
	{
	A a1=new A();
	a1.i=10;
	System.out.println(a1.i);
	a1=new A();
	System.out.println(a1.i);


			}
}
