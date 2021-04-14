class ReadableStar 
{
	public static void main(String[] args) 
	{
		int sp=4;
		int st=1;
		for(int i=1;i<=5;i++)
		{
			PrintSpace(sp);
			PrintStars(st);
			System.out.println();
			sp--;
			st+=2;
		}
	}
	static void PrintSpace(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(" ");
		}
	}
static void PrintStars(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
	}
}