package sortColors75;

/**
 * Created by Zhao Zhe on 2017/9/20.
 */
public class Solution {
    public void sortColors(int[] nums) {

        if(nums.length == 0 || nums == null)
            return;
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                red += 1;
            else if(nums[i] == 1)
                white += 1;
            else
                blue += 1;

        }
        for (int i = 0; i < nums.length; i++) {
            if(red != 0){
                nums[i] = 0;
                red -= 1;
            }else if(white!=0){
                nums[i] = 1;
                white -= 1;
            }else if(blue != 0)
            {
                nums[i] = 2;
                blue -= 1;
            }

        }
    }
}
