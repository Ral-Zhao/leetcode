package bullsAndCows299;

public class Solution
{
	public String getHint(String secret, String guess)
	{
		
		StringBuffer sec = new StringBuffer(secret);
		StringBuffer gue = new StringBuffer(guess);
		int bulls = 0;
		
		for(int i=0;i<sec.length();)
		{
			if(sec.charAt(i) == gue.charAt(i))
			{
				bulls += 1;
				sec.deleteCharAt(i);
				gue.deleteCharAt(i);
			}
			else
			{
				i+=1;
			}
		}
		
		
		int cows = 0;
		for(int i=0;i<sec.length();)
		{
			boolean flag = false;
			for(int j=0;j<gue.length();)
			{
				if(sec.charAt(i) == gue.charAt(j))
				{
					flag = true;
					cows += 1;
					sec.deleteCharAt(i);
					gue.deleteCharAt(j);
					break;
				}
				
				j += 1;
				
			}
			if(flag == false)
				i += 1;
		}
		
		String result = bulls + "A" + cows + "B";
		return result;
		
		
		
    }
}
