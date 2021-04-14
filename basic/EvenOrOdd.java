import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scn.nextInt();
	//	int r=n%2==0;
		if(n%2==0)
		{
		System.out.println("even"+n);
		}
		else
		{
		System.out.println("odd"+n);
		}
	}
}
