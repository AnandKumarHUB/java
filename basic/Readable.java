class Readable
{
	public static void main(String[] args)
	{
		int n=m1();
		System.out.println(n);
		int m=m1()*20;
		System.out.println(m);
		System.out.println(m1());
		if(m1()==10)
		{
			System.out.println("yes");
		}                                                                                                                                                                                                                                                                             
	}

		static int m1()
	{
		System.out.println("execution of M1");
		return 10;
	}
	}