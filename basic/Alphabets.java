import java.util.Scanner; 
class Alphabets
{
	public static void main(String[] args) 
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number of N");
	int n=scn.nextInt();
	System.out.println("enter the latter of digit to get");
	int s=scn.nextInt();
	switch(s)
		{
		case 1:
			System.out.println("this is the 1st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( i==0 || j == 0 || j == n || i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;

		case 2:
			System.out.println("this is the 2st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( i==0 || j == 0 || j == n || i==n/2 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;

		case 3:
			System.out.println("this is the 3st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( j == 0 || i==0 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;

case 4:
			System.out.println("this is the 4st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( j == n|| i==0 || i==n||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;

		case 6:
			System.out.println("this is the 6st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( j == 0|| i==0||i==n||i==n/2&&j<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;
		case 7:
			System.out.println("this is the 7st alphabet");
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
			{
			if ( j == 0|| i==0||i==n/2&&j<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		break;

		default:
			System.out.println("this is not valid latter for the similar alphabets");
	}
}
}