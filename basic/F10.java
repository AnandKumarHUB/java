class F10  
{
	public static void main(String[] args) 
	{
	int i=0;
	int j=0;
	j=m1(++i);
	System.out.println(i);
	System.out.println(j);
	}
	static int m1(int a)
	{
		return ++a;
	}
}