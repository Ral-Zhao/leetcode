package removeDuplicatesfromSortedArray26;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,1,1,1,2};
		
		int temp = s.removeDuplicates(arr);
		for(int i=0;i<temp;++i)
		{
			System.out.println(arr[i]);
		}
	}
}
