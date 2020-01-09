package bestTimetoBuyandSellStockII122;

public class Solution
{
	public int maxProfit(int[] prices) 
	{
		if(prices.length == 0)
		{
			return 0;
		}
		
		int start = 0;
		int profit = 0;
		
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i] < prices[i-1])
			{
				profit = profit + prices[i-1] - prices[start];
				start = i;
			}
			
			if(i == prices.length - 1)
			{
				profit = profit + prices[i] - prices[start];
			}
			
		}
		return profit;
    }
}
