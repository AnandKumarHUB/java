import java.util.Scanner;
class patterns 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of N  ");
		int n=scn.nextInt();
		System.out.println("enter the value of case  ");
		int s=scn .nextInt();
		switch(s)
		{
			case 1:
				System.out.println("this is your 1st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i>=j)
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
				System.out.println("this is your 2st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i<=j)
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
				System.out.println("this is your 3st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i+j<=n-1)
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
				System.out.println("this is your 4st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i+j>=n)
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
		
		case 5:
				System.out.println("this is your 5st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{ 
				if(i>=j && i+j>=n-1)
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
				System.out.println("this is your 6st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{ 
				if(i<=j && i+j<=n-1)
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
				System.out.println("this is your 7st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i>=j && i+j>=n-1 || i<=j && i+j<=n-1 )
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

		case 8:
				System.out.println("this is your 8st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || i==n || j==0 || j==n)
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

		case 9:
				System.out.println("this is your 9st pattern");
				for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0	|| i==(n)/2 || j==(n)/2 || i==n || j==n || i+j==n || i==j)
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
			System.out.println("not valid input");
	} 
} 
}