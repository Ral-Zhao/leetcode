package shuffleAnArray384;

public class Test
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,5};
		Solution s = new Solution(arr);
		int[] result = s.shuffle();
		for(int num : result)
		{
			System.out.println(num);
		}
		result = s.reset();
		for(int num : result)
		{
			System.out.println(num);
		}
		result = s.shuffle();
		for(int num : result)
		{
			System.out.println(num);
		}
	}
}	
