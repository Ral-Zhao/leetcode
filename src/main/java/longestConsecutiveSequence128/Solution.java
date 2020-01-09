package longestConsecutiveSequence128;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhao Zhe on 2017/9/21.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {

        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(!map.containsKey(n)){
                int left = map.containsKey(n-1)? map.get(n-1):0;
                int right = map.containsKey(n+1)? map.get(n+1):0;

                int sum = left+right+1;
                max = Math.max(sum,max);
                map.put(n,sum);
                map.put(n-left,sum);
                map.put(n+right,sum);

            }

        }
        return max;
    }
}
