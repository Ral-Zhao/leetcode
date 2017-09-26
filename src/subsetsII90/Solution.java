package subsetsII90;

import java.util.*;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private Map<Integer,Integer> map = new HashMap<>();


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }

        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> ite = set.iterator();
        int[] num = new int[set.size()];
        int i = 0;
        while(ite.hasNext()){
            num[i] = ite.next();
            i+=1;
        }
        combiantion(num);
        result.add(new ArrayList<>());
        return result;

    }

    public void combiantion(int nums[]){
        if(nums==null||nums.length==0){
            return ;
        }
        List<Integer> list=new ArrayList();
        for(int i=1;i<=nums.length;i++){
            combine(nums, 0,i,list);
        }
    }

    public void combine(int[] nums, int begin,int number,List<Integer> list){
        if(number==0){
            List<Integer> temp = new ArrayList<>();
            for (int i : list){
                temp.add(i);
            }

            result.add(temp);
            return ;
        }
        if(begin==nums.length){
            return;
        }

        for (int i = 1; i <= map.get(nums[begin]); i++) {

            list.add(nums[begin]);
            combine(nums,begin+1,number-1,list);

        }

        for (int i = 1; i <= map.get(nums[begin]); i++) {
            list.remove((Integer) nums[begin]);
        }
        combine(nums,begin+1,number,list);


    }
}
