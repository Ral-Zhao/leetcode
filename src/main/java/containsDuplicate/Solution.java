package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution
{
	public boolean containsDuplicate(int[] nums) 
	{
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;++i)
		{
			set.add(nums[i]);
		}
		
		if(set.size() == nums.length)
		{
			return false;
		}
		else
		{
			return true;
		}
    }
}
