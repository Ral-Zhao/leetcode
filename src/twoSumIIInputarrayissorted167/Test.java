package twoSumIIInputarrayissorted167;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{3,24,25,79,88,150,345};
		int[] result = s.twoSum(arr,175);
		for(int i=0;i<result.length;++i)
		{
			System.out.println(result[i]);
		}
	}
}
