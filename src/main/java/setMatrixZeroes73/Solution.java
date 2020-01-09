package setMatrixZeroes73;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0 || matrix == null)
            return;
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }

            }

        }

        for (int i = 0; i < row.length; i++) {
            if(row[i] == 1){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;

                }
            }

        }
        for (int i = 0; i < col.length; i++) {
            if(col[i] == 1){
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;

                }
            }

        }


    }
}
