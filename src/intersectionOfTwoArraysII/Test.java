package intersectionOfTwoArraysII;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		
		int[] nums1 = new int[]{1,4, 5, 2, 2, 3,};
		int[] nums2 = new int[]{2, 3, 5, 2};
		
		int[] result = s.intersect(nums1, nums2);
		
		for(int i=0;i<result.length;++i)
		{
			System.out.println(result[i]);
		}
	}
}
