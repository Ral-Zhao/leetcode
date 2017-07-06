package reverseVowelsofaString345;

public class Solution
{
	public String reverseVowels(String s)
	{
		if(s == null)
		{
			return null;
		}
		StringBuffer str = new StringBuffer(s);
		int len = s.length()-1;
		int start = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		while(len > start)
		{
			char ch1_1 = str.charAt(start);
			char ch1 = Character.toLowerCase(ch1_1);
			if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
			{
				flag1 = true;
			}
			else
			{
				flag1 = false;
				start += 1;
			}
			char ch2_1 = str.charAt(len);
			char ch2 = Character.toLowerCase(ch2_1);
			if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
			{
				flag2 = true;
			}
			else
			{
				flag2 = false;
				len -= 1;
			}
			
			if(flag1 == true && flag2 == true)
			{
				str.setCharAt(start,ch2_1);
				str.setCharAt(len,ch1_1);
				start += 1;
				len -=1;
			}
			
		}
		return str.toString();

    }
}
