class Recursion1 
{
	static void m1(int i)
	{
		System.out.println(i);
		if(i==10) return;
		m1(i+1);
	}

	public static void main(String[] args) 
	{
		m1(1);
	}
}
