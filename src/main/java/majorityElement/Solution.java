package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	public int majorityElement(int[] nums) 
	{
		int n = nums.length / 2;
		
		int num = 0;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;++i)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i],map.get(nums[i])+1);
				
			}
			else
			{
				map.put(nums[i],1);
			}
			
			if(map.get(nums[i]) > n)
			{
				num = nums[i];
			}
		}
		
		return num;
    }
}
