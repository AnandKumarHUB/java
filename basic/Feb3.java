import java.util.Scanner;
class Feb3 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scn.nextInt();
		if(n==1)
		{
			System.out.println(0);
			return;
		}
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
			{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			}
	}
		
}
