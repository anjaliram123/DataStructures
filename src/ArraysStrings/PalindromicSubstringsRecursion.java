package ArraysStrings;

public class PalindromicSubstringsRecursion {
//T(N) = O(N2)

    public static void main(String[] args) {
        PalindromicSubstringsRecursion pdpr = new PalindromicSubstringsRecursion();
        String s = "axbobxa";
        int count = pdpr.countSubstrings(s);
        System.out.println("The number of substrings are "+count);
    }

    public int countSubstrings(String s) {
        int ans = 0;
        for(int start=0; start<s.length(); start++) {
            for(int end = start; end<s.length(); end++) {
                ans = ans + (checkPalindrome(s, start, end) ? 1:0);
            }
        }
        return ans;
    }

    public boolean checkPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
