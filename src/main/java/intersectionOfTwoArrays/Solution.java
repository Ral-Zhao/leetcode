package intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution
{
	public int[] intersection(int[] nums1, int[] nums2) 
	{
		Set<Integer> num1 = new HashSet<Integer>();
		Set<Integer> num2 = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<nums1.length;++i)
		{
			num1.add(nums1[i]);
		}
		for (int i=0;i<nums2.length;++i)
		{
			num2.add(nums2[i]);
		}
		
		Iterator<Integer> iter = num2.iterator();
		while(iter.hasNext())
		{
			int m = iter.next();
			if(num1.contains(m))
			{
				list.add(m);
			}
			
		}
		
		int sum = list.size();
		int[] result = new int[sum];
		for(int i=0;i<sum;++i)
		{
			result[i] = list.get(i).intValue();
		}
		
		return result;
    }
}
