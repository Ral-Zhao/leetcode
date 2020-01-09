package palindromeNumber9;

public class Solution
{	
	public boolean isPalindrome(int x)
	{
		if(x < 0)
		{
			return false;
		}
		if(x < 10 )
		{
			return true;
		}
		
		int mod = x % 10;
		int temp = x / 10;
		int sum = 0;
		do
		{
			sum = mod + sum * 10;
			mod = temp % 10;
			temp = temp / 10;
		}while(temp != 0);
		sum = sum*10 + mod;
		if(sum != x)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
		
		
		
		
		
    }
}
