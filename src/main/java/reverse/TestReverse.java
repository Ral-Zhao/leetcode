package reverse;

public class TestReverse
{
	public String reverse(String str)
	{
		int i = str.length();
		
		char[] c = new char[i];
		
		for (int j=0;j<str.length();++j)
		{
			c[j] = str.charAt(i-1);
			i-=1;
		}
		
		String str2 = new String(c);
		
		return str2;
	}
}
