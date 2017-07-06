package minesweeper529;

public class Solution
{
	public char[][] updateBoard(char[][] board, int[] click) 
	{
		int x = click[0];
		int y = click[1];
		if(board[x][y] == 'M')
		{
			board[x][y] = 'X';
			return board;
		}
		int count = isEwithM(board,click);
		if(count > 0)
		{
			board[x][y] = (char)(count + '0');
		}
		else
		{
			update(board,x,y);

		}
		return board;
		
		
    }
	public void update(char[][] board,int x, int y)
	{
		int row = board.length;
		int col = board[0].length;
		
		if(x<0 || x >= row || y<0 || y>=col)
		{
			return;
		}
		if(board[x][y] == 'E')
		{
			int[] click = new int[2];
			click[0] = x;
			click[1] = y;
			int b = isEwithM(board,click);
		
			if(0 == b)
			{
				board[x][y] = 'B';
				update(board,x,y-1);
				update(board,x-1,y);
				update(board,x,y+1);
				update(board,x+1,y);
				update(board,x-1,y-1);
				update(board,x+1,y-1);
				update(board,x-1,y+1);
				update(board,x+1,y+1);
			}
			else
			{
				board[x][y] =(char)( b + '0');
				return;
			}
		}
		
	}
	public int isEwithM(char[][] board, int[] pos)
	{
		int row = board.length;
		int col = board[0].length;
		int x = pos[0];
		int y = pos[1];
		int count = 0;
		for(int i=x-1;i<=x+1;++i)
		{
			if(i < 0 || i >= row)
			{
				continue;
			}
			for(int j=y-1;j<=y+1;++j)
			{
				if(j < 0 || j >= col)
				{
					continue;
				}
				if(board[i][j] == 'M')
				{
					count += 1;
				}
				
			}
		}
		return count;
	}
}
