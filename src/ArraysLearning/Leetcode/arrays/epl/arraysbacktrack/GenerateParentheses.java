package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        List<String> li = gp.generateParenthesis(3);
        for(String s : li){
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack("", 0, 0, n,ans);
        return ans;
    }

    public void backtrack(String curr, int open, int close, int max, List<String> li) {
        if(curr.length() == max*2) {
            li.add(curr);
            return;
        }

        if(open < max) {
            backtrack(curr+"(", open+1, close, max, li);
        }
        if(close < open){
            backtrack(curr+")", open, close+1, max, li);
        }
    }
}
