package validTriangleNumber611;


import java.util.Arrays;

public class Solution{
        public int triangleNumber(int[] nums) {

            if(nums.length < 3)
                return 0;
            int sum = 0;

            Arrays.sort(nums);
            for (int i = 0; i < nums.length-2; i++) {
                for (int j = i+1; j < nums.length-1; j++) {
                    int add = nums[i]+nums[j];
                    int k = j+1;
                    while(k <= nums.length-1 && nums[k]<add){
                        sum+=1;
                        k+=1;
                    }
                }
            }

            return sum;
        }
}
