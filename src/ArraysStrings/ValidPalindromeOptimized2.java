package ArraysStrings;

public class ValidPalindromeOptimized2 {

    public static void main(String[] args) {
        ValidPalindromeOptimized2 vp = new ValidPalindromeOptimized2();
        boolean res = vp.validPalindrome("abcca");
        System.out.println(res);
    }

    public boolean validPalindrome(String s) {
        int head = 0;
        int tail = s.length()-1;
        while(head<=tail){
            char chead = s.charAt(head);
            char ctail = s.charAt(tail);
            if(s.charAt(head)==s.charAt(tail)){
                head++;
                tail--;
            }else{
                return (isPalindrome(s, head, tail-1) || isPalindrome(s, head+1, tail));
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int head, int tail){
        while(head<=tail){
            if(s.charAt(head) == s.charAt(tail)){
                head++;
                tail--;
            }else{
                return false;
            }
        }
        return true;
    }
}
