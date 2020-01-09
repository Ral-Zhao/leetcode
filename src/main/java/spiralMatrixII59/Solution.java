package spiralMatrixII59;

/**
 * Created by Zhao Zhe on 2017/9/19.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int forward = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int temp = 1;
        int row = 0;
        int col = 0;
        for (int i = 0; i < n*n; i++) {
            if(forward == 1) {
                nums[row][col] = temp;
                if(col == right){
                    forward = 2;
                    top += 1;
                    row += 1;
                }else {
                    col += 1;
                }


            }else if(forward == 2){
                nums[row][col] = temp;
                if(row == bottom){
                    forward = 3;
                    right -= 1;
                    col -= 1;
                }else {
                    row += 1;
                }

            }else if (forward == 3){
                nums[row][col] = temp;
                if(col == left){
                    forward = 4;
                    bottom -= 1;
                    row -= 1;
                }else {
                    col -= 1;
                }

            }else {
                nums[row][col] = temp;
                if(row == top){
                    forward = 1;
                    left += 1;
                    col += 1;
                }else {
                    row -= 1;
                }

            }
            temp += 1;

        }

        return nums;

    }
}
