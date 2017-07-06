package powerofThree;

public class Solution
{
	public boolean isPowerOfThree(int n) 
	{
		if(n == 0)
		{
			return false;
		}
		double num1 = Math.log10(n);
		double num2 = Math.log10(3);
		
		double delta1 = num1 / num2;
		int delta2 = (int)delta1;
		if(delta1 - delta2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
    }
}
