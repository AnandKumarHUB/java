import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers to fint the palindrom or not");
		int n =scn.nextInt();
		int m=n;
		int s=0;
		while(n>0)
		{
			s=s*10+n%10;
			n/=10;
		}
		if(m==s)
		{
			System.out.println("this is the palindrome numbers  " + s);
		}
		else
		{
			System.out.println("this is not palindrome  " +s);
		}
	}
}