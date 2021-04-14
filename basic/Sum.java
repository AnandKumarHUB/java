import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter A value");
		int a=scn.nextInt();
		System.out.println("enter B value");
		int b=scn.nextInt();
		int c=a+b;
		System.out.println("sum  =" +a+ "+" +b+ "=" +c);
	}
}
