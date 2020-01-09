package singleNumberIII260;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,3,3,5,6,8,5,6,1,9};
		int[] result = s.singleNumber(arr);
		
		for(int num : result)
		{
			System.out.println(num);
		}
	}
}
