package moveZeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public void moveZeroes(int[] nums) 
	{
		int length = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<length;++i)
		{
			if (0 != nums[i])
			{
				list.add(nums[i]);
			}
		}
		
		for (int i=0;i<length;++i)
		{
			if (i < list.size())
			{
				nums[i] = list.get(i);
			}
			else
			{
				nums[i] = 0;
			}
		}
		
    }
}
