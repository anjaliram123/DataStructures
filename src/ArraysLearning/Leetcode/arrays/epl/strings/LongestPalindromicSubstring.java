package ArraysLearning.Leetcode.arrays.epl.strings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
        String s = "noon";
        String res = lp.longestPalindrome(s);
        System.out.println(res);
    }

    public String longestPalindrome(String s) {
        int len = 0;
        int len1= 0;
        int len2 = 0;
        int start = 0; int end = 0;
        for(int i=0;i<s.length();i++) {
            len1 = countPalindromesAroundCenter(s,i,i);
            len2 = countPalindromesAroundCenter(s, i, i+1);
            len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public int countPalindromesAroundCenter(String s, int start, int end) {
        while(start >=0 && end<s.length()) {
            if(s.charAt(start) != s.charAt(end)) {
                break;
            }
                start--;
                end++;
            }
        return end-start-1;
    }
}
