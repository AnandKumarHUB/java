class C 
{
	C()
	{
	System.out.println("this is extract from C();");
	}
	C(int i)
	{
		this();
		System.out.println("this is extracting from C();");
	}
}
class Test5
{
	public static void main(String[] args) 
	{
		C c=new C(10);
	}
}
