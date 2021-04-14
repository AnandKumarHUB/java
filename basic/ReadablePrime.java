class ReadablePrime 
{
	public static void main(String[] args) 
	{
		int n=34567;
		int sum=0;
		do{
			sum =add(n);
			n=sum;
		}while(sum>9);
		System.out.println("sum "+sum);
	}
	static int add(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}