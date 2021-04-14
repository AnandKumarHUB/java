class D 
{
	void m1(Bike b1,Bike b2)
	{
		b1.color="red";
		b2.color=b1.color;
	}
}
class Test9
{
	public static void main(String[] args) 
	{
		Bike bike1=new Bike("white");
		Bike bike2=new Bike("black");
		D b1=new D();
		b1.m1(bike1,bike2);
		System.out.println(bike1.color);
		System.out.println(bike2.color);

	}
}
 