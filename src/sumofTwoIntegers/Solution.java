package sumofTwoIntegers;

public class Solution
{
	public int getSum(int a, int b) 
	{
		int result;
		if(a == b)
		{
			result = 2 * a;
		}
		else
		{
			double temp = (double)a - (double)b;
			double num1 = Math.pow(a,2);
			double num2 = Math.pow(b,2);
			result = (int)((num1 - num2)/(temp));
		}
		
		return result;
		
		
    }
}
