class D 
{
	static int i;
	int j;
	
	void increments()
	{
			++i;
			++j;
	}
	void display()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		D d1=new D();
		D d2=new D();
		D d3=new D();
		d1.increments();
		d2.increments();
		d3.increments();
		d1.display();
		d2.display();
		d3.display();

	}	
}
