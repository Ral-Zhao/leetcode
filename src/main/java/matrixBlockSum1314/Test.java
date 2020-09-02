package matrixBlockSum1314;

/**
 * [[67,64,78],[99,98,38],[82,46,46],[6,52,55],[55,99,45]]
 * 3
 */
public class Test {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {67,64,78},{99,98,38},{82,46,46},{6,52,55},{55,99,45}
        };
        Solution solution = new Solution();
        int[][] result = solution.matrixBlockSum(mat, 3);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+", ");
            }
            System.out.println();
        }
    }
}
