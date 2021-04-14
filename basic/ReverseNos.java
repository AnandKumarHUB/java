import java.util.Scanner;
class  ReverseNos
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scn.nextInt();
		int m;
		m=n;;
		int s=0;
		while(n>0)
		{
			s=(s*10)+n%10;
			n/=10;
		}
		System.out.println("this is the "+m+"=" +s);
	}
}
