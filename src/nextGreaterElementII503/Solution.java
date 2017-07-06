package nextGreaterElementII503;

public class Solution
{
	public int[] nextGreaterElements(int[] nums) 
	{
		int len = nums.length;
		int[] result = new int[len];
		boolean flag = false;
		for(int i=0;i<len;++i)
		{
			int j = (i+1)%len;
			while(j != i)
			{
				flag = false;
				if(nums[j] > nums[i])
				{
					flag = true;
					result[i] = nums[j];
					break;
				}
				
				j = (j+1)%len;
			}
			
			if(flag == false)
			{
				result[i] = -1;
			}
		}
		
		return result;
    }
}
