class Var_arguments2 
{
	public static void main(String[] args) 
	{
		m1();
		m1(1,2,3);
		m1(1,2,3,4,5);
	}
	static void m1(int ... a)
	{
		System.out.println(a.length);
	}
}