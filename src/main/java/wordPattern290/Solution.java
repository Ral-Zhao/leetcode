package wordPattern290;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	public boolean wordPattern(String pattern, String str) 
	{
		String[] s = str.split(" ");
		Map<Character,String> map = new HashMap<>();
		if(s.length != pattern.length())
		{
			return false;
		}
		for(int i=0;i<pattern.length();i++)
		{
			char ch1 = pattern.charAt(i);
			if(map.get(ch1) == null && map.containsValue(s[i]) == true)
			{
				return false;

			}
			else if(map.get(ch1) == null)
			{
				map.put(ch1,s[i]);
			}
			else if(map.get(ch1).equals(s[i]) == false)
			{
				return false;
			}
			
		}
		
		return true;
    }
}
