package productofArrayExceptSelf238;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{0,1,2};
		int[] result = s.productExceptSelf(arr);
		for(int num : result)
		{
			System.out.println(num);
		}
	}
}
