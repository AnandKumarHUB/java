class Rectangular 
{
	int length;
	int breadth;
	static int count;
	Rectangular(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		count++;
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		Rectangular rec=new Rectangular(10,20);
		System.out.println(rec.length);
		System.out.println(rec.breadth);
	}
}



