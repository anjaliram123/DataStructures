package ArraysLearning.Leetcode.thirtydaychallenge;

import stacks.StackImpl;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        BackspaceStringCompare bs = new BackspaceStringCompare();
        String s = "ab##";
        String T = "c#d#";
        boolean res = bs.backspaceCompare(s,T);
        System.out.println(res);
    }

    public boolean backspaceCompare(String S, String T) {
        StackImpl<Character> sstack = new StackImpl<>();
        StackImpl<Character> tstack = new StackImpl<>();
        StringBuilder res = new StringBuilder(" ");
        StringBuilder res2 = new StringBuilder(" ");
        char [] sarray = S.toCharArray();
        char [] tarray = T.toCharArray();

        for(char c : sarray) {
           if(c != '#') {
               sstack.push(c);
           } else {
               if(!sstack.isEmpty()) {
                   sstack.pop();
               }
           }
        }
        for(char c : tarray) {
            if(c != '#') {
                tstack.push(c);
            } else {
                if (!tstack.isEmpty()) {
                    tstack.pop();
                }
            }
        }

        while(!sstack.isEmpty()) {
            res.append(sstack.pop());
        }

        while(!tstack.isEmpty()) {
            res2.append(tstack.pop());
        }
        return res.toString().equals(res2.toString());
    }

}
