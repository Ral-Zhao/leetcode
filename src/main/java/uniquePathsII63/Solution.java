package uniquePathsII63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null){
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[row-1][col-1] == 1){
            return 0;
        }

        if (obstacleGrid[0][0] == 1){
            return 0;
        }
        if (row > 1 && col > 1){
            obstacleGrid[0][0] = obstacleGrid[0][1]==1&&obstacleGrid[1][0]==1?0:-1;
        }else if (row > 1){
            obstacleGrid[0][0] = obstacleGrid[1][0]==1?0:-1;
        }else if (col > 1){
            obstacleGrid[0][0] = obstacleGrid[0][1]==1?0:-1;
        }else {
            return 1;
        }

        for (int i = 1; i <row; i++) {
            if (obstacleGrid[i][0] == 1)
                continue;
            if (obstacleGrid[i-1][0] < 0){
                obstacleGrid[i][0] = -1;
            }
        }
        for (int i = 1; i <col; i++) {
            if (obstacleGrid[0][i] == 1)
                continue;
            if (obstacleGrid[0][i-1] < 0){
                obstacleGrid[0][i] = -1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1)
                    continue;
                if(obstacleGrid[i-1][j] != 1 && obstacleGrid[i][j-1] != 1){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                    continue;
                }
                if (obstacleGrid[i-1][j] != 1){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j];
                }
                if (obstacleGrid[i][j-1] != 1){
                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
                }


            }
        }

        return Math.abs(obstacleGrid[row-1][col-1]);


    }
}
