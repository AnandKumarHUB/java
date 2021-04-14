import java.util.Scanner;
class  pattern7a
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of N");
		int n=scn.nextInt();
		System.out.println("this is pattern7a");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i%2!=0 &&j%2==0)||(i%2==0 &&j%2!=0))
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			
			System.out.println();
		}
	
	}
}