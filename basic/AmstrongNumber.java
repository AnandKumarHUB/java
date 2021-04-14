class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n=1634;
		int m=n;
		int s;
		int sum =0;
		while(n>0)
		{
		s=n%10;
		sum=sum+(s*s*s*s);
		n/=10;
		}
		if(sum == m)
		{
		System.out.println("this is that numbers");
		}
		else
		{
		System.out.println("no this is not");
		}
	}
}


