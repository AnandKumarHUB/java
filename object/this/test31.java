import java.util.Scanner;
class test31
{
	public static void main(String[] args) 
	{
		Book b1=test31.create();
		Book b2=test31.create();
		System.out.println(b1.title+","+ b1.author);
		System.out.println(b2.title+","+ b2.author);
	}
static Book create()
	{
	Scanner scn=new Scanner (System.in);
	System.out.println("enter the title and author");
	String t=scn.nextLine();
	String a=scn.nextLine();
	Book b=new Book(t,a);
	return b;
	}
} 