import java.util.Scanner;
class Feb5
{
	public static void main(String[] args) 
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scn.nextInt();
	int a=0;
	int b=1;
	int c;
	System.out.print(a+" "+b);
	while(true)
		{
		c=a+b;
		if(c>n) break;
			
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
}
