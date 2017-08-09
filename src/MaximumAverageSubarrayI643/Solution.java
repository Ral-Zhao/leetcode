package MaximumAverageSubarrayI643;

/**
 * Created by zhaozhezijian on 2017/8/8.
 */
public class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double max = Integer.MIN_VALUE;
        double average = 0;

        for (int i = 0; i <= nums.length-k; i++) {
            int sum = 0;
            int end = i + k;
            for (int j = i; j < end ; j++) {
                sum += nums[j];

            }

            average = sum*1.0 / k;
            if(average > max)
                max = average;

        }

        return max;
    }
}
