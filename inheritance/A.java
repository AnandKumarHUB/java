 public class A 
{
	static boolean string(String S)
	{
		int l=S.length();
		for(int i=0;i<l/2;i++)
		{
			if(S.charAt(i)!=S.charAt(l-1-i))
			{
				return false;
			}
		}
		return true;
	}

}
class Test1
	{
	
	public static void main (String [] args) 
	{
	
		System.out.println(string("anand"));
		

	}

}