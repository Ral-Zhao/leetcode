package happyNumber;

public class Solution
{
	public boolean isHappy(int n)
	{
		if (n < 10)
		{
			if (n == 1 || n == 7)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			
			int sum = 0;
			int sub;
			do{
				int temp = n % 10;
				sum += temp * temp;
				sub = n / 10;
				n = sub;
			}while(sub != 0);
			
			return isHappy(sum);
			
			
		}
    }
}
