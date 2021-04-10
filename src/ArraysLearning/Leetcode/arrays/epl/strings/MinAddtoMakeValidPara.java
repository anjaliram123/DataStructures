package ArraysLearning.Leetcode.arrays.epl.strings;

import java.util.Stack;

public class MinAddtoMakeValidPara {

    public static void main(String[] args) {
        MinAddtoMakeValidPara m = new MinAddtoMakeValidPara();
        String s = "())";
        int min = m.minAddToMakeValidOptimized(s);
        System.out.println("Min valid is "+min);
    }

    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if( c == '('){
                st.push(c);
            }
            if(c == ')') {
                if(!st.isEmpty()) {
                    st.pop();
                } else {
                    count++;
                }
            }
        }

        while(!st.isEmpty()) {
            st.pop();
            count++;
        }

        return count;
    }

    public int minAddToMakeValidOptimized(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if(c == '(') {
                sb.append(c);
            }
            if(c == ')') {
                if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    count++;
                }
            }
        }

        if(sb.length() != 0) {
            count = count + sb.length();
        }

        return count;

    }
}
