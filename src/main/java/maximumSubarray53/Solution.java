package maximumSubarray53;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1)
            return nums[0];
        int max = Integer.MIN_VALUE;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum - min > max)
                max = sum-min;
            if(sum < min){
                min = sum;
            }



        }

        return max;

    }
}
