package ArraysLearning.Leetcode.arrays.epl.strings;

import stacks.StackImpl;

public class RemoveDuplictesinString {

    public static void main(String[] args) {
        RemoveDuplictesinString r = new RemoveDuplictesinString();
        String a = "abbaca";
        String res = r.removeDuplicatesOptimized(a);
        System.out.println(res);
    }

    public String removeDuplicates(String S) {
        StackImpl<Character> stk = new StackImpl<>();
        for(int i=0 ; i<S.length() ; i++) {
            if(!stk.isEmpty() && stk.peek().equals(S.charAt(i))) {
                stk.pop();
            } else {
                stk.push(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }

    public String removeDuplicatesOptimized (String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<S.length() ; i++) {
            if(sb.length() != 0 && sb.charAt(sb.length()-1)==S.charAt(i)) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
