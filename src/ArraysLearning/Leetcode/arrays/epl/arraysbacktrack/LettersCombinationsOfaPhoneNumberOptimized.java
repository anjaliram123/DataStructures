package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersCombinationsOfaPhoneNumberOptimized {

    public static void main(String[] args) {
        LettersCombinationsOfaPhoneNumberOptimized lp = new LettersCombinationsOfaPhoneNumberOptimized();
        List<String> res = lp.letterCombinations("23");
        for(String s : res){
            System.out.println(s);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if (digits.length() == 0) {
            return output;
        }
        Map<String, String> phone = new HashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};
        StringBuilder sb = new StringBuilder();
        if (digits.length() != 0) {
            backtrack(sb, digits, phone, output);
        }
        return output;
    }

    public void backtrack(StringBuilder combination, String next_digit, Map<String,String> phone, List<String> output) {
        if(next_digit.length() == 0) {
            String res = new String(combination);
            output.add(res);
            return;
        }
        else {
            String d = next_digit.substring(0, 1);
            String letters = phone.get(d);
            for (int i = 0; i < letters.length(); i++) {
                backtrack(combination.append(letters.charAt(i)), next_digit.substring(1), phone, output);
                    combination.deleteCharAt(combination.length()-1);
            }
        }
    }
}
