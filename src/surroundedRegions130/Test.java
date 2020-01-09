package surroundedRegions130;

/**
 * Created by zhaozhezijian on 2020/1/6.
 *
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *
 * Example:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * Explanation:
 *
 * Surrounded regions shouldn’t be on the border,
 * which means that any 'O' on the border of the board are not flipped to 'X'.
 * Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'.
 * Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
public class Test {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'O','O','X'},
                {'X','X','X'},
                {'X','O','X'},
                {'X','X','X'}
        };

        Solution solution = new Solution();
        solution.solve(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
