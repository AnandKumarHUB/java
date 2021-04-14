import java.util.Scanner;
class Prime3 
{
	public static void main(String[] args) 
	{
		int a;
		for(int i=1;i<=50;i++)
		{
			if(i<=1) continue;
			a=1;
			for(int j=2;j<=i/2;j++)
				{
				if(i%j==0)
				a=0;
				break;
				}
		if(a==1)
		System.out.print(" "+i);
		}
	}
}