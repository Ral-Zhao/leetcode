package pascalsTriangle118;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<List<Integer>> generate(int numRows) 
	{
		List<List<Integer>> list = new ArrayList<>();
		
		if(numRows == 0)
		{
			return list;
		}
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<numRows;++i)
		{
			
			List<Integer> listTemp = new ArrayList<>();
			int itemp = 0;
			listTemp.add(1);
			while(itemp < list2.size()-1)
			{
				
				listTemp.add(list2.get(itemp) + list2.get(itemp+1));
				itemp += 1;
			}
			if(i != 0)
				listTemp.add(1);
			list.add(listTemp);
			list2 = listTemp;
			
			
		}
		return list;
    }
}
