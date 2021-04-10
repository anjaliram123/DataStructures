package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.*;

public class ComputePermutationsWithDuplicates {

    public static void main(String[] args) {
        ComputePermutationsWithDuplicates c = new ComputePermutationsWithDuplicates();
        int nums [] = {2,2,3};
        Set<List<Integer>> res = new HashSet<>();
        res = c.compute(nums, res);
        Iterator<List<Integer>> itr = res.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public Set<List<Integer>> compute(int nums[], Set<List<Integer>>res) {
        permute(0, nums, res);
        return res;
    }

    public void permute(int i, int nums[], Set<List<Integer>>res ) {
        if(i == nums.length - 1) {
            //java8 Arrays.stream().boxed.collect takes like 5ms more - do not use it
            //res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            //instead just loop over the array and add it to res
            List<Integer> li = new ArrayList<>();
            for(int f=0;f<nums.length;f++) {
                li.add(nums[f]);
            }
            res.add(li);
            return ;
        }
        for(int j=i;j<nums.length;j++) {
            swap(nums, i, j);
            permute(i+1, nums, res);
            swap(nums, i , j);
        }
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




}

