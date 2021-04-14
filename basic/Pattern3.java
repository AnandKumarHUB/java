import java.util.Scanner;
class Pattern3  
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=scn.nextInt();
		System.out.println("this is patten 3");
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
	}
}
}