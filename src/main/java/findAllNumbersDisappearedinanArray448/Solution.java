package findAllNumbersDisappearedinanArray448;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<Integer> findDisappearedNumbers(int[] nums) 
	{
		List<Integer> list = new ArrayList<>();
		int[] temp = new int[nums.length];
		for(int i=0;i<nums.length;++i)
		{
			temp[nums[i]-1] = 1;
		}
		for(int i=0;i<temp.length;++i)
		{
			if(temp[i] != 1)
				list.add(i+1);
		}
		
		return list;
    }
	
}
