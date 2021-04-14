class A1 
{
	int i;
	int j;
	A1()
	{
	}
	A1(int i,int j)
	{
		this.i=i;
		this.i=j;
	}
	A1(A1 a1)
	{
		A1 obj1=new A1();
		obj1.i=a1.i;
		obj1.j=a1.j;
	}
}
class Test12
{
	public static void main(String[] args) 
	{
		A1 obj1=new A1(9,7);
		System.out.println(obj1.i + "," + obj1.j);
		
		A1 obj2=new A1(obj1);

		System.out.println(obj2.i + "," + obj2.j);
		
	}
}