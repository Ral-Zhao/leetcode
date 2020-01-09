package spiralMatrixII59;

/**
 * Created by Zhao Zhe on 2017/9/19.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] nums = s.generateMatrix(4);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] +",");
            }
            System.out.println();
        }
    }
}
