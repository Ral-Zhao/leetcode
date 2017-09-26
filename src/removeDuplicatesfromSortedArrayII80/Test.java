package removeDuplicatesfromSortedArrayII80;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] num = new int[]{1,2,3,4};
        System.out.println(s.removeDuplicates(num));
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+",");

        }
    }
}
