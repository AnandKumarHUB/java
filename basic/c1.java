class c1 
{
	public static void main(String[] args) 
	{
		int n=5386;
		int p;
		int m=0;
		while(n>0)
		{
			p=n%10;
			m=(m*10)+p;
			n/=10;
		}

		System.out.println(m);
	}
}
