package intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
	public int[] intersect(int[] nums1, int[] nums2) 
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<nums1.length;++i)
		{
			list1.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;++i)
		{
			list2.add(nums2[i]);
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		
		int i = 0;
		int j = 0;
		List<Integer> tempList = new ArrayList<Integer>();
		
		while(i != nums1.length && j != nums2.length)
		{
			if (list1.get(i) < list2.get(j))
			{
				i++;
			}
			else if(list1.get(i) > list2.get(j))
			{
				j++;
			}
			else
			{
				tempList.add(list1.get(i));
				i++;
				j++;
			}
		}
		
		int temp = tempList.size();
		int[] arr = new int[temp];
		for(int k=0;k<temp;++k)
		{
			arr[k] = tempList.get(k);
		}
	
		return arr;
    }
}
