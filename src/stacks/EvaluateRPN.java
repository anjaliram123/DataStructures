package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateRPN {

    public static void main(String[] args) {
        EvaluateRPN evaluateRPN = new EvaluateRPN();
        String [] tokens = {"2","1","+","3","*"};
        int val = evaluateRPN.evalRPN(tokens);
        System.out.println("The evaluated value is "+val);

    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String s : tokens) {
            if(!st.isEmpty() && s.length() == 1 && "+,*,/,-".contains(s)){
                int x = st.pop();
                int y = st.pop();
                switch(s) {
                    case "+":
                        st.push(x+y);
                        break;
                    case "-":
                        st.push(y-x);
                        break;
                    case "*":
                        st.push(x*y);
                        break;
                    case "/":
                        st.push(y/x);
                        break;
                    default:
                        System.out.println("Invalid exp");
                }
            } else {
                st.push(Integer.valueOf(s));
            }

        }
        return st.pop();

    }
}
