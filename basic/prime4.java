class prime4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				break;
				}
			}
				System.out.println(i);
			}
	}
}