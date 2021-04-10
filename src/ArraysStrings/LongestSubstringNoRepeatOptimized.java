package ArraysStrings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeatOptimized {

    public static void main(String[] args) {
        LongestSubstringNoRepeatOptimized  l = new LongestSubstringNoRepeatOptimized();
        String  s = "abcabcbb";
        int count = l.lengthOfLongestSubstring(s);
        System.out.println(count);
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int count = 0;
        while(i<s.length() && j<s.length()) {
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                count = Math.max(count, j-i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}
