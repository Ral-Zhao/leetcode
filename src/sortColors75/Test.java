package sortColors75;

/**
 * Created by Zhao Zhe on 2017/9/20.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = new int[]{2,1,2,1,0,0,1,0,2};
        s.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");

        }
    }
}
