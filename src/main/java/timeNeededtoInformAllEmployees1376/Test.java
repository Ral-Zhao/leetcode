package timeNeededtoInformAllEmployees1376;

public class Test {
    public static void main(String[] args) {
        int n = 15;
        int head = 0;
        int[] manager = new int[]{-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6};
        int[] inform = new int[]{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        Solution solution = new Solution();
        System.out.println(solution.numOfMinutes(n,head,manager,inform));
    }
}
