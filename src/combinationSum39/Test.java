package combinationSum39;

import java.util.List;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = new int[]{2};
        List<List<Integer>> list = s.combinationSum(arr,1);
        for(List<Integer> l : list){
            for(int i:l){
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
}
