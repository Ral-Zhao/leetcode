package findMinimuminRotatedSortedArrayII154;

/**
 * Created by Zhao Zhe on 2017/9/21.
 */
public class Solution {
    public int findMin(int[] nums) {

        if (nums.length == 1)
            return nums[0];
        if(nums[0] < nums[nums.length-1])
            return nums[0];
        int start = 0;
        int end = nums.length-1;
        return helper(nums,start,end);


    }
    private int helper(int[] nums, int start, int end){
        while(Math.abs(start-end) > 1){
            int mid = (start+end)/2;
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                int temp1 = helper(nums,mid,end);
                int temp2 = helper(nums,start,mid);
                return temp1>temp2?temp2:temp1;
            }
            if(nums[mid] >= nums[start] && nums[mid]>=nums[end]){
                start = mid;

            }else if(nums[mid] <= nums[start] && nums[mid] <= nums[end]){
                end = mid;
            }
        }

        return nums[start] > nums[end]? nums[end]:nums[start];
    }
}
