package integerReplacement397;

public class Solution
{
	public int integerReplacement(int n) 
	{
		if(n == Integer.MAX_VALUE)
		{
			return 32;
		}
		if(n == 1)
		{
			return 0;
		}
		else if(n % 2 == 0)
		{
			return 1 + integerReplacement(n/2);
		}
		else
		{
			int a = integerReplacement(n+1);
			int b = integerReplacement(n-1);
			
			return 1 + (a > b ? b : a);
		}
    }
	
	
}
