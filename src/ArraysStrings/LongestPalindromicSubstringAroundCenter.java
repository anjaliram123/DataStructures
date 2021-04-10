package ArraysStrings;

public class LongestPalindromicSubstringAroundCenter {

    public static void main(String[] args) {
        LongestPalindromicSubstringAroundCenter lpa = new LongestPalindromicSubstringAroundCenter();
        String res = lpa.longestPalindrome("axbobxa");
        System.out.println("The substring is " +res);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = extend(s, i, i),
                    s2 = extend(s, i, i + 1);
            if (s1.length() > max.length()) max = s1;
            if (s2.length() > max.length()) max = s2;
        }
        return max;
    }

    private String extend(String s, int i, int j) {
        while(i >=0 && j<s.length()){
            if (s.charAt(i) != s.charAt(j)) break;
            i--;
            j++;
        }
        return s.substring(i + 1, j);

    }
}
