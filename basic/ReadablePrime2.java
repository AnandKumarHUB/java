class ReadablePrime2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(IsPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	static boolean IsPrime(int n)
		{
			if(n<=1) return false;
				for(int i=2;i<=n/2;i++)
			{
				if(i%j==0)
				{
					return false;
				}
			}
			return true;
		}
}