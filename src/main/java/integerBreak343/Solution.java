package integerBreak343;

public class Solution
{
	public int integerBreak(int n) 
	{
		if(n == 2)
		{
			return 1;
		}
		if(n == 3)
		{
			return 2;
		}
		int product = 1;
		int mod = n % 3;
		int sub = n / 3;
		if(mod == 1)
		{
			sub -= 1;
		}
		for(int i=0;i<sub;++i)
		{
			product *= 3;
		}
		if(mod == 1)
		{
			product *= 4;
		}
		if(mod == 2)
		{
			product *= 2;
		}
		
		
		
		return product;
    }
}
