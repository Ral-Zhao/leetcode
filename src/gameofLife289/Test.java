package gameofLife289;

/**
 * Created by Zhao Zhe on 2017/9/21.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] board = new int[][]{{1,1,0},{0,1,0}};
        s.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+",");

            }
            System.out.println();

        }
    }
}
