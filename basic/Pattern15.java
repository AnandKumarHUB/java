import java.util.Scanner;
class Pattern15 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=scn.nextInt();
	int stars=1;
	int space=n-1;
	System.out.println("this is 15 th Pattern");
	for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=space;j++)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				if(k==1||k==stars)
				{

					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
				if(i<=n/2)
				{
					stars+=2;
					space--;
				}
				else
				{
					stars-=2;
					space++;
				}
				System.out.println();		
		}
	}
}