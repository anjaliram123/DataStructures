package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotation {

    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        int res = reversePolishNotation.evaluate("3,4,+,2,*,1,+");
        System.out.println(res);
    }

    public int evaluate(String rpn) {
        if(rpn == null || rpn.isEmpty()) {
            return -1;
        }
        Deque<Integer> st = new ArrayDeque<>();
        String[] token = rpn.split(",");
        for(String symbol : token) {
            if(symbol.length() == 1 && "/*+-".contains(symbol)) {
                int y = st.pop();
                int x = st.pop();
                switch(symbol) {
                    case "/":
                        st.push(x/y);
                        break;
                    case "+":
                        st.push(x+y);
                        break;
                    case "-":
                        st.push(x-y);
                        break;
                    case "*":
                        st.push(x*y);
                        break;
                    default:
                        throw new IllegalArgumentException("Token malformed");
                }
            } else {
                st.push(Integer.valueOf(symbol));
            }
        }
        return st.pop();
    }
}
