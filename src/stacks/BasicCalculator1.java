package stacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BasicCalculator1 {

    public static void main(String[] args) {
        BasicCalculator1 bs = new BasicCalculator1();
        String s = "(1+(4+5+2)-3)+(6+8)";
        int res = bs.calculate(s);
        System.out.println("The calculated string is "+res);
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
        //In java stack extends Vector and Vector uses Array to implement push, pop and isempty methods
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
