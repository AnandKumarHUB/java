class Book 
{
	String title;
	String author;
	Book(String t)
	{
		title=t;
	}
	Book(String t,String a)
	{
		this(t);
		author=a;
	}
}
class Test6
{
	public static void main(String[] args) 
	{
		Book b1=new Book("how to beccome the rich","kishor singh");
		System.out.println(b1.title);
		System.out.println(b1.author);
	}
}
