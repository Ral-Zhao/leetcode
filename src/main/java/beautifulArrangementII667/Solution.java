package beautifulArrangementII667;


public class Solution {
    public int[] constructArray(int n, int k) {

        int max = n-1;
        boolean plus = true;
        int[] result = new int[n];
        int last = 0;
            for (int i = 0; i < k; i++) {
                if(i==0){
                    result[i] = 1;

                }else {
                    if(plus){
                        result[i] = result[i-1] + max;
                        plus = false;
                    }else {
                        result[i] = result[i-1] - max;
                        plus = true;
                    }

                    max -= 1;
                    last = i;
                }

            }
        for (int i = last+1; i < n; i++) {
            if(plus){
                result[i] = result[i-1] + 1;

            }else {
                result[i] = result[i-1] - 1;

            }

        }
        return result;
    }
}
