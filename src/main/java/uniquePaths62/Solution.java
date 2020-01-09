package uniquePaths62;

/**
 * Created by 赵喆子健 on 2017/8/30.
 */
public class Solution {
    public int uniquePaths(int m, int n) {

        if(m == 1 || n == 1)
            return 1;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            arr[m-1][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            arr[i][n-1] = 1;
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = m-2; j >= 0; j--) {
                arr[j][i] = arr[j+1][i]+arr[j][i+1];
            }
        }
        return arr[0][0];
    }
}
