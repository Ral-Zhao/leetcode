package plusOne66;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public int[] plusOne(int[] digits) 
	{
		if(digits.length == 0)
		{
			return new int[]{1};
		}
		int forward = 1;
		List<Integer> list = new ArrayList<>();
		
		for(int i=digits.length-1;i>=0;i--)
		{
			int temp = (digits[i] + forward) % 10;
			forward = (digits[i] + forward) / 10;
			list.add(0,temp);
			
		}
		
		if(forward != 0)
		{
			list.add(0,forward);
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<list.size();++i)
		{
			result[i] = list.get(i);
		}
		
		
        return result;
    }
}
