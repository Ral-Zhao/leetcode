package productofArrayExceptSelf238;

public class Solution
{
	public int[] productExceptSelf(int[] nums) 
	{
		int[] result = new int[nums.length];
		
		int start = 1;
		int end = nums.length-2;
		int startSum = nums[0];
		int endSum = nums[nums.length-1];
		
		for(int i=0;i<result.length;++i)
		{
			result[i] = 1;
		}
		while(start < nums.length)
		{
			result[start] *= startSum;
			result[end] *= endSum;
			startSum = startSum * nums[start];
			endSum = endSum * nums[end];
			start += 1;
			end -= 1;
		}
		
		return result;
    }
}
