package matrixBlockSum1314;

/**
 * Given a m * n matrix mat and an integer K, return a matrix answer where each answer[i][j] is
 * the sum of all elements mat[r][c] for i - K <= r <= i + K, j - K <= c <= j + K, and (r, c) is a
 * valid position in the matrix.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
 * Output: [[12,21,16],[27,45,33],[24,39,28]]
 * Example 2:
 * <p>
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 2
 * Output: [[45,45,45],[45,45,45],[45,45,45]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n, K <= 100
 * 1 <= mat[i][j] <= 100
 */
public class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        int[][] result = new int[m][n];

        dp[0][0] = mat[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + mat[0][i];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + mat[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = mat[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            int rMin = i - K < 0 ? 0 : i - K;
            int rMax = i + K >= m ? m - 1 : i + K;
            for (int j = 0; j < n; j++) {
                int cMin = j - K < 0 ? 0 : j - K;
                int cMax = j + K >= n ? n - 1 : j + K;
                int sub1 = rMin == 0 ? 0 : dp[rMin - 1][cMax];
                int sub2 = cMin == 0 ? 0 : dp[rMax][cMin - 1];
                int add = rMin * cMin == 0 ? 0 : dp[rMin - 1][cMin - 1];
                result[i][j] = dp[rMax][cMax] - sub1 - sub2 + add;
            }
        }
        return result;
    }
}
