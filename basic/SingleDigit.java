import java.util.Scanner;
class SingleDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scn.nextInt();
		int sum=0;
		do
		{
			sum=0;
			while(n>0)
			{
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}while(sum>9);
		System.out.println("the singal digit is found " + sum);
	}
}