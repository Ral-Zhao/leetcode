package beautifulArrangement526;

public class Solution
{
	private int count;
	public int countArrangement(int N) 
	{
		
		int[] arr = new int[N+1];
		
		help(1,N,arr);
		
		return count;
    }
	
	public void help(int pos,int N, int[] arr)
	{
		if(pos == N+1)
		{
			count ++;
			return;
		}
		else
		{
			for(int i=1;i<=N;++i)
			{
				if(arr[i] == 0 && (i % pos == 0 || pos % i == 0))
				{
					arr[i] = 1;
					help(pos+1,N,arr);
					arr[i] = 0;
				}
			}
			
			
			
		}
	}
}
