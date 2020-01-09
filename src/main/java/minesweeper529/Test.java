package minesweeper529;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		char[][] board = new char[][]{
			{'E','E','E','E','E'},
			{'E','E','M','E','E'},
			{'E','E','E','E','E'},
			{'E','E','E','E','E'},
		};
		int[] click = new int[2];
		click[0] = 1;
		click[1] = 2;
		board = s.updateBoard(board,click);
		for(int i=0;i<board.length;++i)
		{
			String str = "";
			for(int j=0;j<board[0].length;++j)
			{
				str = str + "," + Character.toString(board[i][j]);
			}
			System.out.println(str);
		}
	}
}
