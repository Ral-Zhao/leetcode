package setMatrixZeroes73;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] nums = new int[][]{{1,2,3,4},{1,0,2,3},{0,1,2,0}};
        s.setZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]+",");

            }
            System.out.println();

        }
    }
}
