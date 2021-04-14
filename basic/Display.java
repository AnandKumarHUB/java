class Display 
{
	static void display(int n)
	{
		System.out.println(n);
		if(n==10)return;
		display(n+1);
	}

	public static void main(String[] args) 
	{
	
		display(1);
		}
}
