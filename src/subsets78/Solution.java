package subsets78;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static List<List<Integer>> result = null;
    public List<List<Integer>> subsets(int[] nums) {

        result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        if(nums.length == 0)
            return result;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            sub(nums,0,i,list);
        }

        return result;
    }
    private void sub(int[] nums, int start, int number, List<Integer> list){
        if(number == 0){
            List<Integer> temp = new ArrayList<>();
            for(int num : list)
            {
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        if(start == nums.length)
            return;

        list.add(nums[start]);
        sub(nums,start+1,number-1,list);
        list.remove(list.indexOf(nums[start]));
        sub(nums,start+1,number,list);
    }
}
