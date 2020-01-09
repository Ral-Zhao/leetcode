package implementstrStr28;

public class Solution
{
	public int strStr(String haystack, String needle) 
	{
		if(needle.length() == 0)
		{
			return 0;
		}
		int i = 0;
		int j = 0;
		int temp = -1;
		boolean flag = false;
		while(i < haystack.length())
		{
			
			if(flag == false)
			{
				temp = i;
			}
			if(haystack.charAt(i) == needle.charAt(j))
			{
				if(j != needle.length()-1)
				{
					flag = true;
					j += 1;
					i += 1;
				}
				else
				{
					return temp;
				}
				
			}
			else
			{
				flag = false;
				i = temp;
				j = 0;
				i += 1;
			}
		}
		
		if(j < needle.length() || temp == haystack.length())
		{
			return -1;
		}
		else
		{
			return temp;
		}
    }
}
