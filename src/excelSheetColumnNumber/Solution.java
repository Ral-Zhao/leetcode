package excelSheetColumnNumber;

public class Solution
{
	public int titleToNumber(String s) 
	{
		int sum = 0;
		for(int i=0;i<s.length();++i)
		{
			
			int temp = (int)s.charAt(i) - 64;
			sum = sum + (int)Math.pow(26, s.length()-i-1) * temp;
		}
		
		return sum;
    }
}
