package stacks;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String num = "9";
        int k = 1;
        String res = removeKDigits.removeKdigits(num, k);
        System.out.println("The string is "+res);

    }

    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++) {
            char c = num.charAt(i);
            while(!st.isEmpty() && st.peek() > c && k > 0) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        //if k is still remaining after pushing all elements - remove elements till k becomes '0'
        for(int i=0; i<k; ++i) {
            st.pop();
        }


        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: st) {
            if(leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            ret.append(digit);
        }

        /* return the final string  */
        if (ret.length() == 0) return "0";
        return ret.toString();




    }
}
