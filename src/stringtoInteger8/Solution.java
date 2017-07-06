package stringtoInteger8;

public class Solution
{
	public int myAtoi(String str) 
	{
		str = str.trim();
		if(str.equals(""))
		{
			return 0;
		}
		
		boolean flag = false;
		long result = 0;
		long temps = 0;
		for(int i=0;i<str.length();++i)
		{
			char ch = str.charAt(i);
			if(ch == '-' && i == 0)
			{
				flag = true;
			}
			else if(ch == '+' && i == 0)
			{
				flag = false;
			}
			else if(Character.isDigit(ch) == false)
			{
				break;
			}
			else
			{
				int temp = Integer.parseInt(Character.toString(ch));
				result = result * 10 + temp;
				
				if(flag == true)
				{
					temps = result * (-1);
					if(temps < Integer.MIN_VALUE)
					{
						return Integer.MIN_VALUE;
					}
					
				}
				else
				{
					temps = result;
					if(temps > Integer.MAX_VALUE)
					{
						return Integer.MAX_VALUE;
					}
				}
			}
			
		}
		return (int)temps;
			
    }
}
