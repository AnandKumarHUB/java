class Rectangular 
{
	int length;
	int breadth;
	void m1(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void display()
	{
		System.out.println(length+" , "+breadth);
	}
}
class Test2
{
	public static void main(String[] args) 
	{
	Rectangular rec=new Rectangular();
	rec.m1(6,8);
	rec.display();
	}
}