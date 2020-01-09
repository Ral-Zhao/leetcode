package uniqueBinarySearchTrees96;

public class Solution
{
	public int numTrees(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		if(n == 2)
		{
			return 2;
		}
		int[] num = new int[n];
		num[0] = 1;
		num[1] = 2;
		num[2] = 5;
		for(int i=3;i<n;++i)
		{
			int temp = 2*num[i-1];
			int end = i-2;
			for(int j=0;j<=end;++j)
			{
				if(j == end)
				{
					temp += num[j]*num[j];
				}
				else
				{
					temp += 2*num[j]*num[end];

				}
				end -= 1;
			}
			num[i] = temp;
			System.out.println(temp);
		}
		return num[n-1];
	}
	
	
}
