package ArraysStrings;

import java.util.*;

public class ReverseOnlyVowelsOfAString {

    public static void main(String[] args) {
        ReverseOnlyVowelsOfAString r = new ReverseOnlyVowelsOfAString();
        String res = r.reverse("leetcode");
        System.out.println(res);
    }

    public String reverse(String a){
        Stack<Character> st = new Stack();
         List<Character> set = new ArrayList<>();
        set.add('a');set.add('e');set.add('i');
        set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(set.contains(a.charAt(i))){
                st.push(a.charAt(i));
            }
        }
        for(int i=0;i<a.length();i++){
            if(set.contains(a.charAt(i))){
                sb.append(st.pop());
            }else{
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }
}
