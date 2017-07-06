package bestTimetoBuyandSellStock121;

public class Solution
{
	public int maxProfit(int[] prices)
	{
		int imin = 0;
		int imax = 0;
		int mmax = 0;
		for(int i=0;i<prices.length;++i)
		{
			if(prices[i] < prices[imin])
			{
				imin = i;
				imax = i;
			}
			if(prices[i] > prices[imax])
			{
				imax = i;
				int temp = prices[imax] - prices[imin];
				if(temp > mmax)
				{
					mmax = temp;
				}
			}
			
		}
		
		return mmax;
    }
}
