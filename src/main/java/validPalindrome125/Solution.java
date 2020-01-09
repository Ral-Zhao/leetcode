package validPalindrome125;

public class Solution
{
	public boolean isPalindrome(String s) 
	{
		if(s.equals(""))
		{
			return true;
		}
		
		s = s.trim();
		int start = 0;
		int end = s.length()-1;
		
		while(end > start)
		{
			char a = Character.toLowerCase(s.charAt(start));
			char b = Character.toLowerCase(s.charAt(end));
			if(!Character.isLetterOrDigit(a))
			{
				start += 1;
			}
			else if(!Character.isLetterOrDigit(b))
			{
				end -= 1;
			}
			else
			{
				if(a == b)
				{
					start += 1;
					end -= 1;
				}
				else
				{
					return false;
				}
			}
		}
		return true;
    }
}
