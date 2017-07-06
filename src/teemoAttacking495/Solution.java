package teemoAttacking495;

public class Solution
{
	public int findPoisonedDuration(int[] timeSeries, int duration) 
	{
		int len = timeSeries.length;
		if(len == 0)
		{
			return 0;
		}
		int sum = timeSeries[len-1] + duration - timeSeries[0];
		
		for(int i=0;i<len-1;++i)
		{
			int temp = timeSeries[i+1] - (timeSeries[i]+duration); 
			if(temp > 0)
			{
				sum = sum - temp; 
			}
			
			
		}
		
		return sum;
		
    }
}
