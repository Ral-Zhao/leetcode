package countingBits338;

public class Solution
{
	public int[] countBits(int num) 
	{
		int[] result = new int[num+1];
		result[0] = 0;
		if(num == 0)
		{
			return result;
		}
		if(num == 1)
		{
			result[1] = 1;
			return result;
		}
		result[1] = 1;
		int n = 2;
		boolean flag = false;
		while(true)
		{
			for(int i=n;i<2*n;++i)
			{
				if(i == num+1)
				{
					flag = true;
					break;
				}
				result[i] = 1 + result[i-n];
				
			}
			if(flag == true)
			{
				break;
			}
			n = 2 * n;
		}
		
		return result;
		
		
    }
}
