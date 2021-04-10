package ArraysStrings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesisleetcode {

    public static void main(String[] args) {
        ValidParenthesisleetcode vp = new ValidParenthesisleetcode();
        boolean val = vp.isValid("([)]");
        System.out.println(val);
    }

    public boolean isValid(String s) {
        if(s==null){
            return false;
        }
        if(s.isEmpty()){
            return true;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        char cArray[] = s.toCharArray();
        Stack<Character> st = new Stack();
        for(char c : cArray){
           if(map.containsKey(c)){
               char open = st.isEmpty() ? '#' : st.pop();
               if(open != map.get(c)){
                   return false;
               }
           }
           else{
               st.push(c);
           }
        }
        return st.isEmpty();
    }
}
