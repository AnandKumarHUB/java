public class PalindromOfString 
{
	boolean PalindromOfString(String S)
	{
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)!=S.charAt(S.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
class Test1{
	
	public void main(String [] args) 
	{
		PalindromOfString p=new PalindromOfString("java");
		System.out.println(p);
		

	}

}