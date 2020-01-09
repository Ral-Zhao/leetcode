package battleshipsinaBoard419;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		char[][] board2 = new char[][]{{'X','.','X'},{'X','.','X'}};
		int sum = s.countBattleships(board2);
		System.out.println(sum);
	}
}
