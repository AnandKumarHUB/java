class Rectangular 
{
	int length;
	int breadth;
	void m1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	} 
	void display()
	{
		System.out.println(length+" , "+breadth);
	}
}
class Test3
{
	public static void main(String[] args) 
	{
	Rectangular rec=new Rectangular();
	rec.m1(6,8);
	rec.display();
	}
}