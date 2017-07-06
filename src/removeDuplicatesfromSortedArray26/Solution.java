package removeDuplicatesfromSortedArray26;

public class Solution
{
	public int removeDuplicates(int[] nums) 
	{
		int ifree = 1;
		int sum = 1;
		for(int i=1;i<nums.length;++i)
		{
			if(nums[i] > nums[i-1])
			{
				nums[ifree] = nums[i];
				ifree += 1;
				sum += 1;
			}
			
		}
		
		return sum;
    }
}
