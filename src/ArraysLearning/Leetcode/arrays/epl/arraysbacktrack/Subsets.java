package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Subsets {

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int nums[] = {3,1,2,4};
        List<List<Integer>> li = s.subsets(nums);
        ListIterator<List<Integer>> itr = li.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int k = 0;
        while(k<nums.length+1) {
            backtrack(0,new ArrayList<Integer>(), nums, output, k);
            k++;
        }
        return output;
    }

    public void backtrack(int curr, List<Integer> li , int nums[], List<List<Integer>> output, int k) {
        if(li.size() == k) {
            output.add(new ArrayList<>(li));
            return;
        }
        for(int i=curr;i<nums.length;i++) {
                li.add(nums[i]);
                backtrack(i + 1, li, nums, output, k);
                li.remove(li.size() - 1);
            }
    }

    public boolean noDuplicates(int nums[], int i, int j) {
        for(int k = j; k<i;k++) {
            if(nums[k]==nums[i]) {
                return false;
            }
        }
        return true;
    }

}
