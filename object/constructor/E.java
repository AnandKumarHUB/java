class E
{
	E()
	{
		System.out.println("not agrs ctt");
	}
	E(int i)
	{
	System.out.println("int  agrs ctt");
	}
	E(String S)
	{
		System.out.println("this is String typr of ctt");
	}
	public static void main(String[] args) 
	{
		new E();
		new E(10);
		new E("hello");
		new E('a');
	}
}
