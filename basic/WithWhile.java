import java.util.Scanner;
class WithWhile 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of N");
		int n=scn.nextInt();
		int i=1;
		System.out.println("this is anonther patten");
		while(i<=n)
		{
			int j=1;
			{
				while(j<=i)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
					i++;
			}
		}
	}
}