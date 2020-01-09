package findAllDuplicatesinanArray442;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<Integer> findDuplicates(int[] nums) 
	{
		List<Integer> list = new ArrayList<>();
		int[] temp = new int[nums.length];
		for(int i=0;i<nums.length;++i)
		{
			if(temp[nums[i]-1] != 0)
			{
				list.add(nums[i]);
			}
			else
			{
				temp[nums[i]-1] = 1;
			}
		}
		return list;
    }
}
