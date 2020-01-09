package minimumTimeDifference539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
	public int findMinDifference(List<String> timePoints) 
	{
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<timePoints.size();++i)
		{
			String[] str = timePoints.get(i).split(":");
			int minu = Integer.parseInt(str[0])*60+Integer.parseInt(str[1]);
			
			list.add(minu);
		}
		
		Collections.sort(list);
		int min = list.get(1)- list.get(0);
		for(int i=0;i<list.size()-1;++i)
		{
			for(int j=i+1;j<list.size();++j)
			{
				int temp = list.get(j)-list.get(i);
				if(temp > 720)
				{
					temp = 1440 - temp;
				}
				if(temp < min)
				{
					min = temp;
				}
			}
			
		}
		return min;
    }
}
