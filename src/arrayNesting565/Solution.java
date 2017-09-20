package arrayNesting565;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public int arrayNesting(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;

        int n = nums.length;
        int[] max = new int[n];

        for (int i = 0; i < n; i++) {
            if(max[i] != 0)
                continue;
            List<Integer> list = new ArrayList<>();
            int j = i;
            int step = 0;
            while(!list.contains(j))
            {
                list.add(j);
                j = nums[j];
                step += 1;
            }
            if(step == n)
                return n;
            for(int index : list)
            {
                max[index] = step;
            }
        }


        int maxInt = 0;
        for (int i = 0; i < n; i++) {
            if(max[i] > maxInt)
            {
                maxInt = max[i];
            }
        }

        return maxInt;
    }
}
