package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String s = "{[]}";
        boolean isValid = vp.isValid(s);
        System.out.println("Is it a valid parentheses ? "+isValid);
    }

    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if( c == '(') {
                st.push(')');

            } else if(c == '[') {
                st.push(']');

            } else if(c == '{') {
                st.push('}');

            }
            else if (c == '}' || c == ']' || c == ')') {
                if(st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
