package addBinary67;

public class Solution
{
	public String addBinary(String a, String b) 
	{
		if(a == "" && b == "")
		{
			return "0";
		}
		if(a == "")
		{
			return b;
		}
		if(b == "")
		{
			return a;
		}
		String result = "";
		
		
		boolean flag = false;
		if(a.length() < b.length())
		{
			String temp = a;
			a = b;
			b = temp;
		}
		int max = a.length();
		int min = b.length();
		while(min > 0)
		{
			char cha = a.charAt(max-1);
			char chb = b.charAt(min-1);
			
			if(cha == '1' && chb == '1')
			{
				if(flag == true)
				{
					result = 1 + result;
					flag = true;
				}
				else
				{
					result = 0 + result;
					flag = true;
				}
			}
			else if(cha != chb)
			{
				if(flag == true)
				{
					result = 0 + result;
					flag = true;
				}
				else
				{
					result = 1 + result;
					flag = false;
				}
			}
			else
			{
				if(flag == true)
				{
					result = 1 + result;
					flag = false;
				}
				else
				{
					result = 0 + result;
					flag = false;
				}
			
			}
			min -= 1;
			max -= 1;
    }
		
		while(max > 0)
		{
			if(a.charAt(max-1) == '1')
			{
				if(flag == true)
				{
					result = 0 + result;
					flag = true;
				}
				else
				{
					result = 1 + result;
					flag = false;
				}
			}
			else
			{
				if(flag == true)
				{
					result = 1 + result;
					flag = false;
				}
				else
				{
					result = 0 + result;
					flag = false;
				}
			}
			max -= 1;
		}
		if(flag == true)
		{
			return 1 + result;
		}
		return result;
}
}
