package plusOne66;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{9,9,6,9,59};
		int[] result = s.plusOne(arr);
		
		for(int i=0;i<result.length;++i)
		{
			System.out.println(result[i]);
		}
	}
}
