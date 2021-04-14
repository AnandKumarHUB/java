class Triangle 
{
	int base;
	int height;
	Triangle()
	{
	}
	Triangle(int b,int h)
	{
		base=b;
		height=h;
	}
	Triangle(Triangle T)
	{
		this.base=T.base;
		this.height=T.height;
	}
	void Display()
	{
		System.out.println(base+","+ height);
	}
}
class Test11
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle(3,5);
		Triangle t2=new Triangle(); 
		Triangle t3=new Triangle(t1);
		Triangle t4=new Triangle(t2);
		t1.Display();
		t2.Display();
		t3.Display();
		t4.Display();

	}
}
