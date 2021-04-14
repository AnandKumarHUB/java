class AC 
{
	int temp;
	void SetTemp(int n)
	{
		temp=n;
		System.out.println("temp sets to"+temp);
	}
}
class Tset5
{
	public static void main(String[] args) 
	{
		AC ac1=new AC();
		ac1.SetTemp(23);
		AC ac2=new AC();
		ac2.SetTemp(55);
	}
}
