import java.util.Scanner;
class Feb4 
{
	public static void main(String[] args) 
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scn.nextInt();
	int a=0;
	int b=1;
	int c;
	System.out.println(a+" "+b);
	while(true)
		{
		c=a+b;
		if(c<=n) 
			{
			System.out.println(" "+c);
			a=b;
			b=c;
			}
			else
			{
				break;
			}
		}
	}
}
