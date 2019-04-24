package longestSubstringWithoutRepeatingCharacters3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }

        int longest = 1;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int len = 0;
            for (int j = i; j < s.length(); j++) {
                char cur = s.charAt(j);
                if (sb.indexOf(String.valueOf(cur)) != -1){

                    break;
                }
                len ++;
                sb.append(cur);
            }
            if (len > longest){
                longest = len;

            }
        }

        return longest;


    }
}
