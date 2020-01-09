package maxConsecutiveOnes485;

public class Solution
{
	public int findMaxConsecutiveOnes(int[] nums) 
	{
		if(nums.length == 0)
			return 0;
		int temp = nums[0]==1 ? 1:0;
		int max = temp;
		for(int i=0;i<nums.length-1;++i)
		{
			if(nums[i+1]==1)
				temp += 1;
			else
			{
				if(temp > max)
					max = temp;
				temp = 0;
			}
			
			
			
		}
		if(temp > max)
			return temp;
		return max;
    }
}
