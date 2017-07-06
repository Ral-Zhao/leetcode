package uglyNumber;

public class Solution
{
	public boolean isUgly(int num) 
	{
		if (num == 1)
		{
			return true;
		}
		else if(num == 0)
		{
		    return false;
		}
		else
		{
			boolean flag = true;
			while(flag && num != 1)
			{
				if(num % 2 == 0)
				{
					num = num / 2;
					continue;
				}
				else if(num % 3 ==0)
				{
					num = num / 3;
					continue;
				}
				else if(num % 5 ==0)
				{
					num = num / 5;
					continue;
				}
				else
				{
					flag = false;
				}
			}
			
			return flag;
			
		}
		
    }
	

}
