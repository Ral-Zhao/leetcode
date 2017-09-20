package longestContinuousIncreasingSubsequence674;

/**
 * Created by Zhao Zhe on 2017/9/19.
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {

        if(nums.length == 0 || nums == null)
            return 0;
        int temp = nums[0];
        int max = 1;
        int cur = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > temp){
                cur += 1;
            }else {
                if(cur > max){
                    max = cur;

                }
                cur = 1;
            }
            temp = nums[i];

        }
        if(cur > max){
            max = cur;

        }

        return max;
    }
}
