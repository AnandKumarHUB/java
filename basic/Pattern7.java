import java.util.Scanner;
class  Pattern7
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the N");
		int n=scn.nextInt();
		System.out.println("this is pattren 7");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+(i+j)%2);
			}
			System.out.println();
		}
	}
}