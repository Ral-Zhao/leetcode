package topKFrequentElements347;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution
{
	public List<Integer> topKFrequent(int[] nums, int k) 
	{
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num : nums)
		{
			if(map.get(num) == null)
			{
				map.put(num,1);
			}
			else
			{
				map.put(num,map.get(num)+1);
			}
		}
		
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		List<Integer> value = new ArrayList<>();
		while(iter.hasNext())
		{
			value.add(iter.next());
		}
		Collections.sort(value);
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = map.keySet();
		List<Integer> key = new ArrayList<>();
		
		for(int num : set)
		{
			key.add(num);
		}
		while(k > 0)
		{
			boolean flag = false;
			for(Integer num : key)
			{
				if(map.get(num) == value.get(value.size()-1))
				{
					list.add(num);
					value.remove(value.size()-1);
					k--;
				}
				if(k == 0)
				{
					flag = true;
					return list;
				}
			}
			if(flag == true)
			{
				break;
			}
		}
		return list;
    }
}
