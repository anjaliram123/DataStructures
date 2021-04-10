package ArraysLearning.Leetcode.arrays.epl.strings;

public class PalindromicSubstrings {

    public static void main(String[] args) {
        PalindromicSubstrings ps= new PalindromicSubstrings();
        String s = "aba";
        int res = ps.countSubstrings(s);
        System.out.println(res);
    }
    public int countSubstrings(String s) {
        //this solution doesnt work for "aba"
        //the correct palindromes are aba, a,b,a - total 4
        //but output is 5 as it counts aba twice once in line 20 and other in line 23
        //in this solution for string aaa - it considers aa and aaa, but there are two aa,aa's here
        //which this solution doesnt count
        int count = 0;
        count = count+s.length();
        int j =0;
        //check if substrings are palindromes
        for(int i=0;i<s.length();i++) {
            count = count + checkPalindrome(s,j,i);
        }
        //check if the given string is palindrome
        count = count + checkPalindrome(s,0,s.length()-1);
        return count;
    }

    public int checkPalindrome(String s, int start, int end) {
        int count = 0;
        while(start < end && end < s.length()) {
            if(s.charAt(start) != s.charAt(end)) {
                break;
            }
            start++;
            end--;
            count++;
        }
        return count;
    }

}
