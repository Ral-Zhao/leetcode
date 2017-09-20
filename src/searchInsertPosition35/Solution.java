package searchInsertPosition35;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums.length == 0)
            return 0;
        if(target <= nums[0] )
            return 0;
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            else {
                if(nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }

        if(nums[start] >= target)
            return start;
        else
            return start+1;
    }
}
