package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithNoRepeat {


    public static void main(String[] args) {
        LongestSubstringWithNoRepeat l = new LongestSubstringWithNoRepeat();
        String s = "abcabcbb";
        int longest = l.lengthOfLongestSubstring(s);
        System.out.println(longest);
    }

    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isUnique(s, i, j)){
                    count = Math.max(count, j-i);
                }
            }
        }
        return count;

    }

    public boolean isUnique(String s , int start, int end) {
        List<Character> li = new ArrayList<>();
        for(int i=start; i<end;i++) {
            if(li.contains(s.charAt(i))) {
                return false;
            }
            li.add(s.charAt(i));
        }
        return true;
    }
}
