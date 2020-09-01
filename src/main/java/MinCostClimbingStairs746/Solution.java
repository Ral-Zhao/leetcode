package MinCostClimbingStairs746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int len = cost.length;
        int[] dp = new int[len];

        for (int i = 2; i < len; i++) {
            dp[i] = min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return min(dp[len - 2] + cost[len - 2], dp[len - 1] + cost[len - 1]);
    }

    private int min(int a, int b) {
        return a <= b ? a : b;
    }
}
