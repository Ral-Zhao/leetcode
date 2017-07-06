package validSudoku36;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public boolean isValidSudoku(char[][] board) 
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<8;++j)
			{
				if(board[i][j] == '.')
				{
					continue;
				}
				for(int k=j+1;k<9;++k)
				{
					if(board[i][k] == '.')
					{
						continue;
					}
					if(board[i][j] == board[i][k])
					{
						return false;
					}
				}
			}
		}
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<8;++j)
			{
				if(board[j][i] == '.')
				{
					continue;
				}
				for(int k=j+1;k<9;++k)
				{
					if(board[k][i] == '.')
					{
						continue;
					}
					if(board[j][i] == board[k][i])
					{
						return false;
					}
				}
			}
		}
		
		for(int i=0;i<9;i+=3)
		{
			for(int j=0;j<9;j+=3)
			{
				List<Character> list = new ArrayList<>();
				for(int k=i;k<i+3;++k)
				{
					for(int w=j;w<j+3;++w)
					{
						if(board[k][w] == '.')
						{
							continue;
						}
						if(list.contains(board[k][w]))
						{
							return false;
						}
						else
						{
							list.add(board[k][w]);
						}
					}
				}
			}
		}
		return true;
		
    }
}
