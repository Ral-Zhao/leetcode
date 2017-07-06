package numberof1Bits191;

public class Solution
{
	public int hammingWeight(int n) 
	{
		int sum = 0;
		int i = 1;
		while(n != 0)
		{
			int temp = n&i;
			if(temp == 1)
			{
				sum+=1;
			}
			n = n >>> 1;
		}
		
		return sum;
    }
}
