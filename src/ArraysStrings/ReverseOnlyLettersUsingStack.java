package ArraysStrings;

import java.util.Iterator;
import java.util.Stack;

public class ReverseOnlyLettersUsingStack {

    public static void main(String[] args) {
        ReverseOnlyLettersUsingStack r = new ReverseOnlyLettersUsingStack();
        String res = r.reverse("ab-cd");
        System.out.println(res);
    }

    public String reverse(String S){
        Stack<Character> letters = new Stack<>();
        char carray[] = S.toCharArray();
        for(char c:carray){
            if(Character.isLetter(c)){
            letters.push(c);}
        }
        StringBuilder sb = new StringBuilder();
        for(char c:carray){
            if(Character.isLetter(c)){
                sb.append(letters.pop());
            } else{
                sb.append(c);
            }
        }
        for(Character s : letters) {
            System.out.println(s);
        }

        Iterator<Character> it = letters.iterator();
        return sb.toString();
    }
}
