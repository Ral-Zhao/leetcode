package longestCommonPrefix14;

public class Solution
{
	public String longestCommonPrefix(String[] strs) 
	{
		if(strs.length == 0)
		{
			return "";
		}
		int j = 0;
		boolean flag = true;
		int sum = 0;
		while(flag)
		{
			int temp = 0;
			for(int i=0;i<strs.length;++i)
			{
				if(strs[i] == "")
				{
					return "";
				}
				
				if(j < strs[i].length())
				{
					if(i == 0)
					{
						temp = strs[i].charAt(j);
					}
					else
					{
						int temp2 = strs[i].charAt(j);
						if(temp != temp2)
						{
							flag = false;
							break;
						}
					}
					
				}
				else
				{
					flag = false;
					break;
				}
				
			}
			if(flag == true)
			{
				sum += 1;
			}
			j += 1;
		}
		
		String result = strs[0].substring(0,sum);
		return result;
    }
}
