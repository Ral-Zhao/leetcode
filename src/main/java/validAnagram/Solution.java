package validAnagram;

public class Solution
{
	public boolean isAnagram(String s, String t) 
	{
		if (s.length() != t.length())
		{
			return false;
		}
		
		int[] s1 = new int[26];
		int[] s2 = new int[26];
		
		for (int i=0;i<s.length();++i)
        {
			int j = (int)s.charAt(i) - 97;
			s1[j] = s1[j] + 1;
			
			int k = (int)t.charAt(i) - 97;
			s2[k] = s2[k] + 1;
        }
		
		for (int i=0;i<26;++i)
		{
			if(s1[i] != s2[i])
			{
				return false;
			}
		}
		return true;
		
		
    }
}	
