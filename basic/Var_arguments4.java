class Var_arguments4 
{
	public static void main(String[] args) 
	{
		System.out.println(add(3,4));
		System.out.println(add(1,2,3,4,5,6,7,8,9));
	}
	static int add(int ... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}