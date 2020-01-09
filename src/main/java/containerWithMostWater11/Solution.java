package containerWithMostWater11;

/**
 * Created by Zhao Zhe on 2017/9/22.
 */
public class Solution {
    public int maxArea(int[] height) {
        int end = height.length-1;
        int start = 0;
        int max = Math.min(height[0],height[end])*(end);
        while(start < end){
            int temp = Math.min(height[start],height[end])*(end-start);
            if(temp > max)
                max = temp;

            if(height[start] < height[end])
                start+=1;
            else if(height[start] > height[end])
                end -= 1;
            else {
                if(height[start+1] < height[end-1])
                    start+=1;
                else if(height[start+1] > height[end-1])
                    end -= 1;
                else
                    start += 1;
            }
        }

        return max;

    }


}
