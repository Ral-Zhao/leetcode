package mergeSortedArray88;

public class Solution
{
	public void merge(int[] nums1, int m, int[] nums2, int n) 
	{
		
		int itemp = 0;
		int jtemp = 0;
		if(m == 0)
		{
			while(jtemp < n)
			{
				nums1[itemp] = nums2[jtemp];
				itemp += 1;
				jtemp += 1;
			}
		}
		while(jtemp < n && itemp < m)
		{	
			boolean end = false;
			while(nums2[jtemp] >= nums1[itemp])
			{
				if(itemp == m - 1)
				{
					end = true;
					break;
				}
				itemp += 1;
			}
			if(end)
			{
				while(jtemp < n)
				{
					nums1[m] = nums2[jtemp];
					m += 1;
					jtemp += 1;
				}
				break;
			}
			
			int move = m-1;
			while(move >= itemp)
			{
				nums1[move+1] = nums1[move];
				move -= 1;
			}
				nums1[itemp] = nums2[jtemp];
				itemp += 1;
				jtemp += 1;
				m += 1;
		}
		
	}
}
