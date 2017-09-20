package rotateImage48;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Solution {
    public void rotate(int[][] matrix) {

        int start = 0;
        int end = matrix.length-1;
        int count = matrix.length/2;
        for (int i = 0; i < count; i++) {
            int row = i;
            int col = i;
            int loop = end - start;
            for (int j = 0; j < loop; j++) {
                int lim = end - j;
                int add = row + j;
                int temp1 = matrix[row][add];
                int temp2 = matrix[add][end];
                int temp3 = matrix[end][lim];
                int temp4 = matrix[lim][col];

                matrix[add][end] = temp1;
                matrix[end][lim] = temp2;
                matrix[lim][col] = temp3;
                matrix[row][add] = temp4;


            }
            start += 1;
            end -= 1;


        }
    }
}
