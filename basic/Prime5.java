import java.util.Scanner;
class Prime5 
{
	public static void main(String[] args) 
	{
		int a;
		boolean PrimeFlag=true;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scn.nextInt();
		System.out.println("the prime number is as below");
		for(int i=1;i<=n;i++)		
		{
			if(i<=1) continue;
			a=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					a=0;
				break;
			}
		
		if(a==1)
		{
			if(PrimeFlag)
			{
				System.out.println(i);
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