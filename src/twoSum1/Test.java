package twoSum1;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,2,6,5};
		
		int[] result = s.twoSum(arr,11);
		System.out.println(result[0] + "," + result[1]);
	}
}
