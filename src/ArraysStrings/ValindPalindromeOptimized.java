package ArraysStrings;

//This doesnt need to change the original String
public class ValindPalindromeOptimized {

    public static void main(String[] args) {
        ValindPalindromeOptimized vp = new ValindPalindromeOptimized();
        boolean res = vp.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);
    }

    public boolean  isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length()-1;
        while(head <= tail){
            char chead = s.charAt(head);
            char ctail = s.charAt(tail);
            if(!Character.isLetterOrDigit(chead)){
                head++;
            }
            else if(!Character.isLetterOrDigit(ctail)){
                tail--;
            }
            else if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)){
                return false;
            }
            else {
                head++;
                tail--;
            }
        }
        return true;
    }
}
