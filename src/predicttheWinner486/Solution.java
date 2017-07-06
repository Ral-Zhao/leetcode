package predicttheWinner486;

public class Solution
{
	public boolean PredictTheWinner(int[] nums) 
	{
		
		int n = nums.length;
	    int[][] dp = new int[n][n];
	    for (int i = 0; i < n; i++) { dp[i][i] = nums[i]; }
	    for (int len = 1; len < n; len++) {
	        for (int i = 0; i < n - len; i++) {
	            int j = i + len;
	            dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
	        }
	    }
	    
	    for(int i=0;i<n;++i)
	    {
	    	for(int j=0;j<n;++j)
	    	{
	    		System.out.print(dp[i][j] + ",");
	    	}
	    	System.out.println();
	    }
	    return dp[0][n - 1] >= 0;
    }
}
