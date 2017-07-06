package countNumberswithUniqueDigits357;

public class Solution
{
	public int countNumbersWithUniqueDigits(int n) 
	{
		if(n == 0)
		{
			return 1;
		}
		if(n == 1)
		{
			return 10;
		}
		
		int sum = 9;
		for(int i=0;i<n-1;++i)
		{
			sum *= 9 - i;
		}
		
		return countNumbersWithUniqueDigits(n-1) + sum;
    }
}
