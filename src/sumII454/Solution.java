package sumII454;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) 
	{
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;++i)
        {
        	for(int j=0;j<B.length;++j)
        	{
        		if(map.containsKey(A[i]+B[j]))
        		{
        			map.put(A[i]+B[j],map.get(A[i]+B[j])+1);
        		}
        		else
        		{
        			map.put(A[i]+B[j],1);
        		}
        	}
        }
        
        for(int i=0;i<C.length;++i)
        {
        	for(int j=0;j<D.length;++j)
        	{
        		int temp = C[i] + D[j];
        		if(map.containsKey(-temp))
        		{
        			sum += map.get(-temp);
        		}
        		
        		
        		
        	}
        }
        
        
        return sum;
    }
}
