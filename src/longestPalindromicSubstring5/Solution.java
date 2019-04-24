package longestPalindromicSubstring5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()||s.length()==1){
            return s;
        }
        int window = s.length();
        while (window > 0){
            for (int i = 0; i < s.length(); i++) {
                int end = i + window;
                if (end >s.length()){
                    break;
                }
                String sub = s.substring(i,end);
                if (isPalindromic(sub))
                    return sub;
            }
            window --;
        }

        return null;
    }

    private boolean isPalindromic(String input){
        char[] charArr = input.toCharArray();
        int start = 0;
        int end = charArr.length-1;
        while (start < end){
            if (charArr[start] == charArr[end]){
                start ++;
                end --;
                continue;
            }
            return false;
        }
        return true;
    }

    public String solutionDP(String s){
        if (s == null || s.isEmpty()){
            return s;
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        String result = "";
        for (int i = len-1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    if (i==j || j == i+1 || dp[i+1][j-1] == 1){
                        dp[i][j] = 1;
                    }
                }
                if(dp[i][j] == 1){
                    if(j-i+1 > result.length()){
                        result = s.substring(i,j+1);
                    }
                }
            }
        }

        return result;
    }
}
