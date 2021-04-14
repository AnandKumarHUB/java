class E 
{
	int i;
	E(int i)
	{
		this.i=i;
	}
	void m1(E e)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(e.i);
		System.out.println();
	}
}
class Test10
{		
	public static void main(String[] args) 
	{
		E e1=new E(10);
		E e2=new E(20);
		e1.m1(e2);
		e2.m1(e1);
		e2.m1(e2);
		e1.m1(new E(30));
	}
}
