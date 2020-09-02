package countSquareSubmatriceswithAllOnes1277;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{
                {0,1,1,1,1},
                {1,1,1,0,1},
                {1,0,1,1,1}
        };
        System.out.println(solution.countSquares(arr));

        int[][] arr2 = new int[][]{
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        System.out.println(solution.countSquares(arr2));

        int[][] arr3 = new int[][]{
                {1, 1, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        System.out.println(solution.countSquares(arr3));
    }
}
