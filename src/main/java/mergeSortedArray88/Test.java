package mergeSortedArray88;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] nums1 = new int[]{0};
		int[] nums2 = new int[]{1};
		
		s.merge(nums1,0,nums2,1);
		for(int i=0;i<nums1.length;++i)
		{
			System.out.println(nums1[i]);
		}
	}
}	
