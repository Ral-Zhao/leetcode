package MaximumProductofThreeNumbers628;

import java.util.Arrays;

/**
 * Created by zhaozhezijian on 2017/8/8.
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;

        if(len == 3)
            return nums[0]*nums[1]*nums[2];
        int result = 0;
        Arrays.sort(nums);
        int result1 = nums[len-1]*nums[len-2]*nums[len-3];
        int result2 = nums[len-1]*nums[0]*nums[1];
        result = Math.max(result1,result2);

        return result;
    }
}
