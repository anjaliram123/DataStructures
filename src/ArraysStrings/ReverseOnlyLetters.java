package ArraysStrings;

import java.util.Arrays;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        ReverseOnlyLetters r = new ReverseOnlyLetters();
        String s = r.reverseOnlyLetters("ab-cd");
        System.out.println(s);
    }

    String reverseOnlyLetters(String S) {
        if (S == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(S);
        for(int i=0, j=S.length()-1; i<j;){
            if(!Character.isLetter(S.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(S.charAt(j))){
                j--;
            } else{
                sb.setCharAt(i, S.charAt(j));
                sb.setCharAt(j--, S.charAt(i++));
            }
        }
        return sb.toString();
    }
}
