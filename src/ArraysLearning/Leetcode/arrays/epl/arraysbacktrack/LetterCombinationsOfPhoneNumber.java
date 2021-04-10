package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber l = new LetterCombinationsOfPhoneNumber();
        List<String> res = l.letterCombinations("23");
        for(String s : res){
            System.out.println(s);
        }
    }


    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if(digits.length() == 0) {
            output.add("");
            return output;
        }
        Map<Character, String> phone = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        int k = digits.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<digits.length();i++) {
            sb.append(phone.get(digits.charAt(i)));
        }
        char carray [] = new char[sb.length()];
        for(int i=0;i<sb.length();i++) {
            carray[i] = sb.charAt(i);
        }
        backtrack(carray, output, new StringBuilder(), k, 0);
        return output;
    }

    public void backtrack(char carray[], List<String> output, StringBuilder sb, int k, int start) {
        if(sb.length() == k) {
            String res = new String(sb);
            output.add(res);
            return;
        }

        for(int i = start; i< carray.length ;i++) {
            sb.append(carray[i]);
            backtrack(carray, output, sb, k , i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
