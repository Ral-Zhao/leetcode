package shuffleAnArray384;

import java.util.Random;

public class Solution
{
	private int[] nums;
	public Solution(int[] nums) 
	{
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() 
    {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() 
    {
        int[] result = new int[nums.length];
        
        Random random = new Random();
        
        for(int i=nums.length-1;i>=0;--i)
        {
        	
        	result[i] = nums[i];
        }
        for(int i=result.length;i>0;--i)
        {
        	int j = random.nextInt(i);
        	int temp = result[i-1];
        	result[i-1] = result[j];
        	result[j] = temp;
        }
        
        
        return result;
        
        
    }
}
