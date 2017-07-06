package missingNumber268;

public class Solution
{
	public int missingNumber(int[] nums) 
	{
		/*
		 * Method 1
		 */
		int result = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			result ^= i ^ nums[i];
		}
		result ^= nums.length;
		
		return result;
		
		/*
		 * Method 2
		 
		long sum1 = 0;
		long sum2 = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum1 += nums[i];
			sum2 += i;
		}
		
		sum2 += nums.length;
		
		return (int)(sum2 - sum1);
		
		*/
    }
}
