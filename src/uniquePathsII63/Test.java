package uniquePathsII63;

public class Test {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };


        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
