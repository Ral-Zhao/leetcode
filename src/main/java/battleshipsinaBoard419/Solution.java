package battleshipsinaBoard419;

public class Solution
{
	public int countBattleships(char[][] board) 
	{
		int row = board.length;
		int col = board[0].length;
		int sum = 0;
		if(row == 1 && col == 1)
		{
			return board[0][0] == 'X'? 1:0;
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(board[i][j] == 'X')
				{
					if(i!= row-1 && j!=col-1)
					{
						if(board[i][j+1] == 'X')
						{
							sum += 1;
							for(int k=j+1;k<col;++k)
							{
								if(board[i][k] == 'X')
								{
									board[i][k] = '.';
								}
								else
								{
									break;
								}
							}
						}
						else if(board[i+1][j] == 'X')
						{
							sum += 1;
							for(int k=i+1;k<row;++k)
							{
								if(board[k][j] == 'X')
								{
									board[k][j] = '.';
								}
								else
								{
									break;
								}
							}
						}
						else
						{
							sum += 1;
						}
					}
					else if(i == row-1 && j != col-1)
					{
						if(board[i][j+1] == 'X')
						{
							sum += 1;
							for(int k=j+1;k<col;++k)
							{
								if(board[i][k] == 'X')
								{
									board[i][k] = '.';
								}
								else
								{
									
									break;
								}
							}
						}
						else
						{
							sum += 1;
						}
					}
					else if (j == col-1 && i != row-1)
					{
						if(board[i+1][j] == 'X')
						{
							sum += 1;
							for(int k=i+1;k<row;++k)
							{
								if(board[k][j] == 'X')
								{
									board[k][j] = '.';
								}
								else
								{
									break;
								}
							}
						}
						else
						{
							sum += 1;
						}
					}
					else
					{
						if(board[i][j] == 'X')
						{
							sum += 1;
						}
					}
					
				}
					
			}
		}
		return sum;
    }
}
