package ArraysStrings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
        String s = "axbobxa";
        System.out.println("The longest Palindromic substring is " +lp.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return null;
        int n = s.length();
        int max = 0;
        int maxstart = 0;
        int maxend = 0;
        boolean [][] dp = new boolean[n][n];
        int ans = 0;
        //single length substrings
        for(int i=0; i<n;i++) {
            dp[i][i]=true;
            ans = ans+1;
            max = 1;
        }

        //double length substrings
        for(int i=0; i<n-1;i++) {
            dp[i][i+1] = (s.charAt(i) == s.charAt(i+1));
            ans = ans + (dp[i][i+1] ? 1:0);
            if(dp[i][i+1])
            {
                max = Math.max(max,i+i+1);
                maxstart = i;
                maxend = i+1;
            }

        }
        //for substring length 3 and all substrings greater than 3;
        for(int len=3; len<=n; len++) {
            for(int i=0, j=i+len-1; j<n; i++,j++) {
                dp[i][j] =  dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                if(dp[i][j])
                {
                    max = Math.max(max,i+j);
                    maxstart = i;
                    maxend = j;
                }
            }
        }
        return s.substring(maxstart, maxend+1);
    }
}
