package maximumSwap670;

/**
 * Created by Zhao Zhe on 2017/9/21.
 */
public class Solution {
    public int maximumSwap(int num) {
        String target = num+"";
        StringBuffer sb = new StringBuffer(target);
        int[] nums = new int[target.length()];
        for (int i = 0; i < nums.length; i++) {
            int temp = Integer.parseInt(target.substring(i,i+1));
            nums[i] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = maxIndex(nums,i);
            if(maxIndex != i && nums[i] != nums[maxIndex]){
                sb.replace(i,i+1,nums[maxIndex]+"");
                sb.replace(maxIndex,maxIndex+1,nums[i]+"");
                break;
            }
        }
        return Integer.parseInt(sb.toString());

    }

    private int maxIndex(int[] nums,int start){
        int max = -1;
        int index = start;
        for (int i = start; i < nums.length; i++) {
            if(nums[i] >= max){
                max = nums[i];
                index = i;
            }

        }
        return index;
    }
}
