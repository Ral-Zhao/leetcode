package moveZeroes;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] nums = new int[]{1, 2, 0, 0, 2, 5, 1};
		
		s.moveZeroes(nums);
		for (int i=0;i<nums.length;++i)
		{
			System.out.println(nums[i]);
		}
	}
}
