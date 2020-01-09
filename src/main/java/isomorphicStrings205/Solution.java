package isomorphicStrings205;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	public boolean isIsomorphic(String s, String t)
	{
		Map<Character,Character> map = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch2 = t.charAt(i);
			char ch1 = s.charAt(i);
			if(map.get(ch2) == null && map.containsValue(ch1) == true)
			{
				return false;

			}
			else if(map.get(ch2) == null)
			{
				map.put(ch2,ch1);
			}
			else if(map.get(ch2) != ch1)
			{
				return false;
			}
			
		}
		
		return true;
		
    }
}
