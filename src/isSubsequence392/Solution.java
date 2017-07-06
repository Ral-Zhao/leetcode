package isSubsequence392;

public class Solution
{
	public boolean isSubsequence(String s, String t) 
	{
		if(t.length() < s.length())
		{
			return false;
		}
		if(s.length() == 0)
		{
			return true;
		}
		if(t.length() == 0)
		{
			return false;
		}
		
		int i = 0;
		int j = 0;
		while(i < t.length())
		{
			char temp = s.charAt(j);
			if(t.charAt(i) == temp)
			{
				if(j == s.length()-1)
				{
					return true;
				}
				else
				{
					j += 1;
				}
				
			}
			i += 1;
		}
		return false;
    }
}
