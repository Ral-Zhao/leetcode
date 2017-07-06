package removeElement27;

public class Solution
{
	public int removeElement(int[] nums, int val) 
	{
		if(nums.length == 0)
		{
			return 0;
		}
		if(nums.length == 1 && nums[0] == val)
		{
			return 0;
		}
		int start = 0;
		int end = nums.length-1;
		int sum = 0;
		while(end >= start)
		{
			if(nums[start] == val)
			{
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				
				end -= 1;
				sum += 1;
			}
			else
			{
				start += 1;
			}
			
		}
		
		return nums.length-sum;
    }
}
