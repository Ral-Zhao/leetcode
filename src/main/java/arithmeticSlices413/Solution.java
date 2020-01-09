package arithmeticSlices413;

public class Solution
{
	public int numberOfArithmeticSlices(int[] A) 
	{
		if(A.length < 3)
		{
			return 0;
		}
		int sum = 0;
		int div = 0;
		for(int i=0;i<=A.length-3;++i)
		{
			if(A[i+1]-A[i] == A[i+2]-A[i+1])
			{
				sum += 1;
				div = A[i+1]-A[i];
			
			int j = i + 2;
			while(j+1 < A.length && A[j] + div == A[j+1])
			{
				sum += 1;
				j += 1;
			}
			}
		}
		return sum;
    }
}
