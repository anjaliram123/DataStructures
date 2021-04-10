package ArraysStrings;

public class ValidPalindrome2 {
//wont work for "deeee" since we are delting only tail,
    //we also need to delete head and check again if its palindrome
    public static void main(String[] args) {
        ValidPalindrome2 vp = new ValidPalindrome2();
        boolean res = vp.validPalindrome("abca");
        System.out.println(res);
    }

    public boolean validPalindrome(String s) {
        int head = 0;
        int count = 0;
        int tail = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(head <= tail){
            char chead = sb.charAt(head);
            char ctail = sb.charAt(tail);
            if(!Character.isLetterOrDigit(chead)){
                head++;
            } else if(!Character.isLetterOrDigit(ctail)){
                tail --;
            } else if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)){
                count++;
                if(count>1){
                    return false;
                }
               sb.deleteCharAt(tail);
                tail--;
            } else{
                head++;
                tail--;
            }
        }


        return true;
    }

}
