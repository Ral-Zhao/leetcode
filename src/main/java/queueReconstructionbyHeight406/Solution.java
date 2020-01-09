package queueReconstructionbyHeight406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution
{
	public int[][] reconstructQueue(int[][] people) 
	{
		ArrayList<int[]> list = new ArrayList<>();
		Arrays.sort(people,new Comparator<int[]>()
		{
				@Override
				public int compare(int[] o1, int[] o2)
				{
					if(o1[0] == o2[0])
					{
						
						return o1[1]-o2[1];
					}
					else
					{
						return o2[0]-o1[0];
					}
					
				}
		});
		
		for(int[] e : people)
		{
			list.add(e[1],e);
		}
		
		
		return list.toArray(new int[people.length][]);
    }
}
