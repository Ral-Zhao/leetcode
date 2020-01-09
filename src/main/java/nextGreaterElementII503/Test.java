package nextGreaterElementII503;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] nums = new int[]{9, 8, 7, 3, 2, 1, 6};
		
		int[] result = s.nextGreaterElements(nums);
		for(int n : result)
		{
			System.out.println(n);
		}
	}
}
