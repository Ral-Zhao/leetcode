package climbingStairs70;

public class Solution
{
	public int climbStairs(int n) 
	{
		if (n == 0 || n == 2)
		{
			return n;
		}
		
		
		int sum = 1;
		
		int temp = n / 2;
		for (int i=n-1;i>temp;--i)
		{
			int s = n - i;
			int sum2 = new Long(que(i,s)).intValue();
			sum = sum + sum2;
		}
		if(n % 2 ==0)
		{
			sum+=1;
		}
		return sum;
    }
	
	public long que(int n, int s)
	{
		long sum = 1;
		int temp = 1;
		for(int i=n;i>n-s;--i)
		{
			if (temp != s && sum % temp == 0)
			{
				sum = sum * i / temp;
				temp += 1;
			}
			else
			{
				sum = sum * i;
			}
			
		}
		while (temp <= s)
		{
			sum = sum / temp;
			temp += 1;
		}
		
		return sum;
	}
	
}
