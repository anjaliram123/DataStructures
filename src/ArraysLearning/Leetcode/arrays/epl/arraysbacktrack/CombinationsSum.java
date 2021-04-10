package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.*;

public class CombinationsSum {

    public static void main(String[] args) {
        CombinationsSum c = new CombinationsSum();
        int candidates[] = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> res = c.combinationSum(candidates,target);
        ListIterator<List<Integer>> itr = res.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target,  output, li,candidates);
        return output;
    }

    public void backtrack(int start, int remain, List<List<Integer>> output, List<Integer> li, int candidates[]) {
        if(remain == 0){
            output.add(new ArrayList<>(li));
            return;
        }
        if(remain < 0 ) {
            return;
        }
        for(int i=start;i<candidates.length;i++) {
            if( i > start && candidates[i] == candidates[i-1]) {
                continue;
            }
            li.add(candidates[i]);
            backtrack(i+1, remain - candidates[i], output, li, candidates);
            li.remove(li.size() - 1);
        }
    }
}
