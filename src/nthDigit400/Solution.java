package nthDigit400;

public class Solution
{
	public int findNthDigit(int n) 
	{
		if(n < 10)
		{
			return n;
		}
		int i = 1;
		long sub = 9;
		int temp = n;
		int mod = 0;
		
		while(temp > sub)
		{
			temp = temp - (int)sub;
			sub = 9;
			for(int j=0;j<i;++j)
			{
				sub = sub * 10;
			}
			i += 1;
			sub = sub * i;
		}
		mod = temp % i;
		int div = temp / i;
		
		temp = 1;
		for(int j=0;j<i-1;++j)
		{
			temp = temp * 10;
		}
		temp = temp + div-1;
		int result = 0;
		if(mod == 0)
		{
			String s = String.valueOf(temp);
			result = Integer.parseInt(s.substring(s.length()-1,s.length()));
		}
		else
		{
			String s = String.valueOf(temp+1);
			result = Integer.parseInt(s.substring(mod-1,mod));
		}
		return result;
		
		
    }
}
