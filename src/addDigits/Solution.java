package addDigits;

public class Solution
{
	public int addDigits(int num)
	{
		if (num <= 9)
		{
			return num;
		}
		else
		{
			String n = Integer.toString(num);
			while (n.length() > 1)
			{
				int sum = 0;
				for (int i=0;i<n.length();++i)
				{
					sum = Integer.valueOf(Character.toString(n.charAt(i))) + sum;
					
				}
				
				n = Integer.toString(sum);
			}
			
			return Integer.parseInt(n);
		}
    }
}
