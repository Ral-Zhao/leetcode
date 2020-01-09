package singleNumberIII260;

import java.util.HashSet;
import java.util.Set;

public class Solution
{
	public int[] singleNumber(int[] nums) 
	{
		int[] result = new int[2];
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			if(set.contains(nums[i]))
			{
				set.remove(nums[i]);
			}
			else
			{
				set.add(nums[i]);
			}
		}
		
		Integer[] temp = set.toArray(new Integer[0]);
		result[0] = temp[0];
		result[1] = temp[1];
		return result;
				
				
    }
}
