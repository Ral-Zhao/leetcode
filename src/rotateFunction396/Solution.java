package rotateFunction396;

public class Solution
{
	public int maxRotateFunction(int[] A) 
	{
		int k = A.length;
		int sum = 0;
		int temp = 0;
		for(int i=0;i<k;++i)
		{
			sum += A[i];
			temp = temp + A[i] * i;
		}
		int max = temp;
		for(int i=0;i<k;++i)
		{
			int j = k - i - 1;
			temp = temp - A[j] * (k - 1) + sum - A[j];
			
			if(temp > max)
			{
				max = temp;
			}
			
		}
		
		return max;
    }
}
