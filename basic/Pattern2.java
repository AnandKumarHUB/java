import java.util.Scanner;
class Pattern2  
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=scn.nextInt();
		System.out.println("this is patten 2");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
		System.out.println();
	}
}
}