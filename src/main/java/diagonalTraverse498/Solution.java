package diagonalTraverse498;

public class Solution
{
	public int[] findDiagonalOrder(int[][] matrix) 
	{
		if(matrix.length == 0)
		{
			return new int[0];
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int[] result = new int[col*row];

		boolean trav = false;
		int i = 0;
		int j = 0;
		int index = 0;
		while(i != row && j != col)
		{
			if(trav == false)
			{
				while(i != 0 && j != col-1)
				{
					result[index] = matrix[i][j];
					index ++;
					i -= 1;
					j += 1;
				}
				result[index] = matrix[i][j];
				index ++;
				if(j == col-1)
				{
					i ++;
				}
				else if(i == 0)
				{
					j ++;
				}
				
				trav = true;
			}
			else
			{
				while(j != 0 && i != row-1)
				{
					result[index] = matrix[i][j];
					index ++;					
					i += 1;
					j -= 1;
				}
				result[index] = matrix[i][j];
				index ++;				
				if(i == row-1)
				{
					j ++;
				}
				else if(j == 0)
				{
					i ++;
				}
				
				trav = false;
			}
			
		}
		return result;
    }
}
