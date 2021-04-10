package ArraysStrings;

public class PalindromicSubstringsDP {

//T(N) = O(N3)

    //647. Palindromic Substrings
    public static void main(String[] args) {
        PalindromicSubstringsDP pdp = new PalindromicSubstringsDP();
        String s = "axbobxa";
        int count = pdp.countSubstrings(s);
        System.out.println("The number of substrings are "+count);
    }

    public int countSubstrings(String s) {
        int n = s.length();
        if (n <= 0)
            return 0;
        boolean [][] dp = new boolean[n][n];
        int ans = 0;
        //single length substrings
        for(int i=0; i<n;i++) {
            dp[i][i]=true;
            ans = ans+1;
        }

        //double length substrings
        for(int i=0; i<n-1;i++) {
            dp[i][i+1] = (s.charAt(i) == s.charAt(i+1));
            ans = ans + (dp[i][i+1] ? 1:0);
        }
        //for substring length 3 and all substrings greater than 3;
        for(int len=3; len<=n; len++) {
            for(int i=0, j=i+len-1; j<n; i++,j++) {
                dp[i][j] =  dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                ans = ans + (dp[i][j] ? 1:0);
            }
        }
        return ans;
    }
}
