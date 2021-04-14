import java.util.Scanner;
class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of N");
		int n=scn.nextInt();
		int star=1;
		System.out.println("this is 13th patterns");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			if(i<=n/2)
				star++;
			else
				star--;
			}
			System.out.println();
	}
}