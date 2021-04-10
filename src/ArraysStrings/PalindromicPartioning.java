package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartioning {

    public static void main(String[] args) {
        PalindromicPartioning pp = new PalindromicPartioning();
        List<List<String>> li = pp.partition("axbobxa");
        int a = 10;
        System.out.println(li);

    }

    public List<List<String>> partition(String s) {
        List<List<String>> op = new ArrayList<>();
        backtrack(new ArrayList<>(), op, 0, s);

        //try using dp
        /*List<String> li1 = new ArrayList<>();
        boolean dp[][] = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length(); i++) {
            dp[i][i] = true;
            if(dp[i][i]){
                li1.add(s.substring(i,i+1));
            }
        }

        op.add(li1);
        List<String> li2 = new ArrayList<>();
        for(int i=0; i<s.length()-1;i++) {
            dp[i][i+1] = (s.charAt(i) == s.charAt(i+1));
            if(dp[i][i+1]) {
                li2.add(s.substring(i, i+2));
            }
        }
        op.add(li2);
        //for substring length 3 and all substrings greater than 3;
        for(int len=3; len<=s.length(); len++) {
            List<String> li3 = new ArrayList<>();
            for(int i=0, j=i+len-1; j<s.length(); i++,j++) {
                dp[i][j] =  dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                if(dp[i][j]) {
                    li3.add(s.substring(i, j+1));
                }
            }
            op.add(li3);
        }*/

        return op;
    }

    public void backtrack(List<String> li, List<List<String>> op, int start, String s) {
        if(start >= s.length()) {
            op.add(new ArrayList<>(li));
        }
        for(int end=start; end < s.length(); end++) {
            if(checkPalindrome(s,start,end)){
                li.add(s.substring(start,end+1));
                backtrack(li,op,end+1,s);
                li.remove(li.size()-1);
            }
        }
    }

    public boolean checkPalindrome(String s, int i, int j) {
       while(i<j) {
           if(s.charAt(i) != s.charAt(j)) {
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}
