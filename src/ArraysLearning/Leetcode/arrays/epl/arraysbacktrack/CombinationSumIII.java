package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CombinationSumIII {

    public static void main(String[] args) {
        CombinationSumIII c = new CombinationSumIII();
       // int candidates[] = {2,5,2,1,2};
        int target = 9;
        int k = 3;
        List<List<Integer>> res = c.combinationSum(target, k);
        ListIterator<List<Integer>> itr = res.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<Integer>> combinationSum(int target, int k) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        backtrack(1, target,  output, li, k);
        return output;
    }

    public void backtrack(int start, int remain, List<List<Integer>> output, List<Integer> li, int k) {
        if(remain == 0 && li.size() == k){
            output.add(new ArrayList<>(li));
            return;
        }
        if(remain < 0 ) {
            return;
        }
        for(int i=start;i<=9; i++) {
            li.add(i);
            backtrack(i+1, remain - i, output, li, k);
            li.remove(li.size() - 1);
        }
    }

}
