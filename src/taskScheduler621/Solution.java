package taskScheduler621;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {

        if(n == 0)
            return tasks.length;

        int num = tasks.length;
        int[] arr = new int[26];
        for (int i = 0; i < num; i++) {
            int index = tasks[i] - 65;
            arr[index] = arr[index]+1;
        }

        Arrays.sort(arr);
        int i = 25;
        while(i >= 0 && arr[i] == arr[25]) i--;

        return Math.max(tasks.length, (arr[25] - 1) * (n + 1) + 25 - i);




    }

}
