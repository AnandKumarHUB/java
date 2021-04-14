import java.util.Scanner;
class Pattern11
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter the value of N");
		int n=scn.nextInt();
		int space=n-1;
		int stars=1;
		System.out.println("this is 11th pattern");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			stars+=2;
		}
	}
}
