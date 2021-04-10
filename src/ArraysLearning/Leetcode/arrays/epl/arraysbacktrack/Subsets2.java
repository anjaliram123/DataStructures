package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Subsets2 {

    public static void main(String[] args) {
        Subsets2 s2 = new Subsets2();
        int nums[] = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> li = s2.subsets(nums);
        ListIterator<List<Integer>> itr = li.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<Integer>> subsets(int nums[]) {
        List<List<Integer>> output = new ArrayList<>();
        for(int k=0;k<=nums.length;k++) {
            backtrack(0, output, nums,k, new ArrayList<>());
        }
        return output;
    }

    public void backtrack(int curr, List<List<Integer>> output, int nums[], int k , List<Integer> li) {
        if(li.size() == k) {
            output.add(new ArrayList<>(li));
            return;
        }

        for(int i=curr; i<nums.length; i++) {
            if(i > curr && nums[i] == nums[i-1]){
                continue;
            }
            li.add(nums[i]);
            backtrack(i + 1, output, nums, k, li);
            li.remove(li.size() - 1);
        }
    }



}
