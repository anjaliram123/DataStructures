package stacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BasicCalculator3 {

    public static void main(String[] args) {
        BasicCalculator3 bs = new BasicCalculator3();
        String s = "2*(5+5*2)/3+(6/2+8)";
        int res = bs.calculate(s);
        System.out.println("The calculated value is "+res);
    }

    public int calculate(String s) {
        Queue<Character> q = new ArrayDeque<>();
        char [] carray = s.toCharArray();
        for(Character c : carray) {
            q.offer(c);
        }
        q.offer('+');
        return cal(q);
    }

    public int cal(Queue<Character> q) {
        Stack<Integer> st = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        while(!q.isEmpty()) {
            char c = q.poll();
            if(c == ' '){
                continue;
            }
            if(Character.isDigit(c)) {
                currentNumber = (currentNumber * 10) + c - '0';
            }
            else if(c == '(') {
                currentNumber = cal(q);
            }
            else {
                if(operation == '+'){
                    st.push(+currentNumber);
                }
                else if(operation == '-'){
                    st.push(-currentNumber);
                }
                else if(operation == '*'){
                    st.push( st.pop() * currentNumber);
                }
                else if(operation == '/'){
                    st.push(st.pop() / currentNumber);
                }
                operation = c;
                currentNumber = 0;
                if(c == ')') {
                    break;
                }
            }

        }
        int result = 0;
        while(!st.isEmpty()) {
            result = result + st.pop();
        }
        return result;
    }
}
