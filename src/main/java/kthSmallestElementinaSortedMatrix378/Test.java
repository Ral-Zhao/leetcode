package kthSmallestElementinaSortedMatrix378;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[][] arr = new int[][]
		{
			{1,3,5,7,9},{2,4,6,8,10},{11,13,15,17,19},{12,14,16,18,20},{21,22,23,24,25}
			
		};
		
		System.out.println(s.kthSmallest(arr,24));
	}
}
