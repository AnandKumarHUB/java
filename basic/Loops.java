class Loops 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" "+j);
				if(j==5)break;
			}
			//if(i==5)break;
			System.out.println();
		}
	}
}