package removeDuplicatesfromSortedArrayII80;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length < 3)
            return nums.length;
        int step = 1;
        int ifree = 0;


        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                if(step > 1){
                    nums[ifree++] = nums[i-1];

                }
                nums[ifree++] = nums[i-1];
                step = 1;

            }else {
                step += 1;
            }
        }
        if(step > 1){
            nums[ifree++] = nums[nums.length-1];

        }
        nums[ifree++] = nums[nums.length-1];

        return ifree;
    }
}
