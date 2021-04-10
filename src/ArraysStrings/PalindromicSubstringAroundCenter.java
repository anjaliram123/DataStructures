package ArraysStrings;

public class PalindromicSubstringAroundCenter {

    public static void main(String[] args) {
        PalindromicSubstringAroundCenter pda = new PalindromicSubstringAroundCenter();
        int count = pda.count("axbobxa");
        System.out.println("The count is" +count);
    }

    public int count(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            //odd length strings
            ans = ans + checkPalindrome(s, i, i);

            //even length strings
            ans = ans + checkPalindrome(s, i, i+1);
        }
        return ans;
    }

    public int checkPalindrome(String s, int lo, int high) {
        int ans = 0;
        while (lo >= 0 && high < s.length()) {
            if(s.charAt(lo) != s.charAt(high)) {
                break;
            }
            lo--;
            high++;
            ans++;
        }
        return ans;
    }
}
