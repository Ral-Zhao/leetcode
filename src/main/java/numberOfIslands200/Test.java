package numberOfIslands200;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * Output: 1
 * Example 2:
 *
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * Output: 3
 */
public class Test {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'1','0','0','1','0','1'},
        };

        Solution solution = new Solution();
        System.out.println(solution.numIslands(arr));

    }
}
