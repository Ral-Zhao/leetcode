package decodeWays91;

public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') continue; // if the character is '0', one digit and two digits are both invalid.
            dp[i] += dp[i + 1];
            if (i < s.length() -1 && Integer.valueOf(s.substring(i, i + 2)) <= 26) dp [i] += dp[i + 2];
        }

        for (int a:dp){
            System.out.print(a+",");
        }
        System.out.println();
        return dp[0];

    }
}
