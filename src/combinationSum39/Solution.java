package combinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int target = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        this.target =target;
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        helper(candidates,0,list,0);

        return result;
    }
    private void helper(int[] arr, int pos, List<Integer> list, int sum){
        if(pos > arr.length-1)
            return;
        if(arr[pos]+sum == target){
            list.add(arr[pos]);
            List<Integer> temp = new ArrayList<>();
            for(int i : list){
                temp.add(i);
            }
            result.add(temp);
            list.remove(list.size()-1);

            return;
        }else if(arr[pos]+sum > target){
            return;
        }
        list.add(arr[pos]);
        helper(arr,pos,list,sum+arr[pos]);
        list.remove(list.size()-1);

        helper(arr,pos+1,list,sum);
    }
}
