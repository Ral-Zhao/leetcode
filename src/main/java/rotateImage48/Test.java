package rotateImage48;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] arr = new int[5][5];
        int sum = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sum;
                sum += 1;
            }
        }
        s.rotate(arr);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
