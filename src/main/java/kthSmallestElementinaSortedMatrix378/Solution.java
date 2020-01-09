package kthSmallestElementinaSortedMatrix378;

import java.util.Arrays;

public class Solution
{
	public int kthSmallest(int[][] matrix, int k) 
	{
		int len = matrix.length;
		int[] temp = new int[len * len];
		int index = 0;
		for(int i=0;i<len;++i)
		{
			for(int j=0;j<len;++j)
			{
				temp[index] = matrix[i][j];
				index += 1;
				
			}
			
		}
		
		Arrays.sort(temp);
		
		return temp[k-1];
		
		
		
		
		
		
		
    }
}
