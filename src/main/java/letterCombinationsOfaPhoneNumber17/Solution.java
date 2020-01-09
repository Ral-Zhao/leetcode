package letterCombinationsOfaPhoneNumber17;

import java.util.*;

public class Solution {
    private static final Map<Character,List<String>> MAP = new HashMap<>();
    private static List<String> result;
    static {

        MAP.put('2', Arrays.asList("a","b","c"));
        MAP.put('3', Arrays.asList("d","e","f"));
        MAP.put('4', Arrays.asList("g","h","i"));
        MAP.put('5', Arrays.asList("j","k","l"));
        MAP.put('6', Arrays.asList("m","n","o"));
        MAP.put('7', Arrays.asList("p","q","r","s"));
        MAP.put('8', Arrays.asList("t","u","v"));
        MAP.put('9', Arrays.asList("w","x","y","z"));

    }

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if (digits == null || digits.isEmpty()){
            return result;
        }
        char[] chars = digits.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char ch:chars){
            characters.add(ch);
        }

        combination(characters,"",1);

        return result;
    }

    private void combination(List<Character> list, String preStr, int layer){
        if (layer == list.size()){
            char num = list.get(layer-1);
            List<String> charList = MAP.get(num);
            for (String s:charList){
                result.add(preStr+s);
            }
            return;
        }
        char num = list.get(layer-1);
        List<String> charList = MAP.get(num);
        for (String s:charList){
            combination(list,preStr+s,layer+1);
        }

    }
}
