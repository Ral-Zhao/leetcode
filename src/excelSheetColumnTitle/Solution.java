package excelSheetColumnTitle;

public class Solution
{
	public String convertToTitle(int n) 
	{
		StringBuffer b = new StringBuffer();
		if(n <= 26)
		{
			char ch =(char)(n + 64);
			b.insert(0,ch);
		}
		else
		{
			
			while(0 != n)
			{
				int m = n % 26;
				
				int k = n / 26;
				
				if(0 == m)
				{
					m = 26;
					k -= 1;
				}
				
				char ch = (char)(m + 64);
				
				b.insert(0, ch);
				
				n = k;
			}
			
		}
		
		return b.toString();
    }
}
