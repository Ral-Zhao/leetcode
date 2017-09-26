package subsetsII90;

import java.util.List;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = new int[]{1,1,2,2};
        List<List<Integer>> result = s.subsetsWithDup(nums);
        for (List<Integer> list : result){
            for(int i : list){
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
}
