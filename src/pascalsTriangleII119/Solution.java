package pascalsTriangleII119;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<Integer> getRow(int rowIndex) 
	{
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<rowIndex+1;++i)
		{
			
			List<Integer> listTemp = new ArrayList<>();
			int itemp = 0;
			listTemp.add(1);
			while(itemp < list.size()-1)
			{
				
				listTemp.add(list.get(itemp) + list.get(itemp+1));
				itemp += 1;
			}
			if(i != 0)
				listTemp.add(1);
			list = listTemp;
			
			
		}
		return list;
    }
}
