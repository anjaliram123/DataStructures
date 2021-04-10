package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int nums [] = {1,2,3};
        Permutations p = new Permutations();
        List<List<Integer>> output = p.permute(nums);
        output.forEach( li -> System.out.println(li));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0 ) return res;
        boolean visited[] = new boolean[nums.length];
        helper(res, nums, 0, new ArrayList<Integer>(), visited);

        return res;
    }

    public void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> list, boolean visited[]) {
        if (list.size() == nums.length ) {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0 ; i <nums.length ; i++) {
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                helper(res, nums, index + 1, list, visited);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
