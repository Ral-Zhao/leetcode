package minimumMovestoEqualArrayElementsII462;

public class Solution
{
	public int minMoves2(int[] nums) 
	{
		long min = 0;
		long sum = 0;
		for(int i=0;i<nums.length;++i)
		{
			for(int j=0;j<nums.length;++j)
			{
				sum += Math.abs(nums[i]-nums[j]);
				
			}
			System.out.println(sum);
			if(i == 0)
			{
				min = sum;
			}
			if(sum < min)
			{
				min = sum;
			}
			sum = 0;
		}
		
		return (int)min;
        
    }
}
