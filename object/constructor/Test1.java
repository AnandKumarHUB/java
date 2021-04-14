class A 
{
	A()
	{
		System.out.println("excution of A constroctor");
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("-----------------------");
		A a2=new A();
	}
}
