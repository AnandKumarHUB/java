import java.util.Scanner;
class Prime2
{
	public static void main(String[] args) 
	{
		int a;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the nos that how many prime nos you wants");
		int n=scn.nextInt();
		boolean PrimeFlag=true;
		for(int i=1;i<=n;i++)
		{
			if(i<=1) 
				continue;
			a=1;
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					a=0;
					break;
				}
			}
			if(a==1)
			{
				if(PrimeFlag)
				{
					System.out.print(" "+i);
					PrimeFlag=false;
				}
				else
				{
					PrimeFlag=true;
				}
			}
	}
}
}