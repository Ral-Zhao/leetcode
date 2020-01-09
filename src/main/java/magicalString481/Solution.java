package magicalString481;

public class Solution
{
	public int magicalString(int n) 
	{
		if(n == 0)
		{
			return 0;
		}
		int start = 2;
		int pos = 2;
		int sum = 0;
		int count = 0;
		int[] temp = new int[n+4];
		temp[0] = 1;
		temp[1] = 2;
		temp[2] = 2;
		while(count < n)
		{
			if(temp[pos] == 1)
			{
				if(temp[start] == 1)
				{
					temp[++start] = 2;
				}
				else
				{
					temp[++start] = 1;
				}
				count += 1;
			}
			else
			{
				if(temp[start] == 1)
				{
					temp[++start] = 2;
					temp[++start] = 2;
				}
				else
				{
					temp[++start] = 1;
					temp[++start] = 1;
				}
				count += 2;
			}
			pos += 1;
		}
		for(int i=0;i<n;++i)
		{
			if(temp[i] == 1)
			{
				sum += 1;
			}
		}
		return sum;
    }
}
