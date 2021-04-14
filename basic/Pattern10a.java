import java.util.Scanner;
class Pattern10a 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of N");
		int n=scn.nextInt();
		int space=n-1;	
		System.out.println("this is 10a th Pattern");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
				space--;
		}
		
	}
}