package maximumXORofTwoNumbersinanArray421;

import java.util.Arrays;

public class Solution
{
	public int findMaximumXOR(int[] nums) 
	{
		int max = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i] == nums[i+1])
			{
				continue;
			}
			for(int j=i+1;j<nums.length;++j)
			{
				if((nums[i]^nums[j]) > max)
				{
					max = nums[i] ^ nums[j];
				}
			}
		}
		return max;
    }
}
