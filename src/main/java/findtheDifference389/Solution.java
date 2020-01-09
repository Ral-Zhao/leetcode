package findtheDifference389;

public class Solution
{
	public char findTheDifference(String s, String t)
	{
		
		StringBuffer s1 = new StringBuffer(s);
		StringBuffer t1 = new StringBuffer(t);
		char result;
		
		for(int i=0;i<s1.length();++i)
		{
			result = s1.charAt(i);
			int index = t1.indexOf(Character.toString(result));
			if(index == -1)
			{
				return result;
			}
			else
			{
				t1 = t1.deleteCharAt(index);
			}
			
		}
		return t1.charAt(0);
		
		
    }
}
