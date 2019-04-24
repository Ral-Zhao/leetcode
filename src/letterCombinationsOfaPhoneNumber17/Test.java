package letterCombinationsOfaPhoneNumber17;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String num = "234";
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations(num);
        result.forEach(s-> System.out.println(s));
    }
}
