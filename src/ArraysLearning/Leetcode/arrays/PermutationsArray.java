package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsArray {

    public static void main(String[] args) {
        PermutationsArray p = new PermutationsArray();
        int nums [] = {1,2,3};
        List<List<Integer>> output = p.permute(nums);
        output.forEach( li -> System.out.println(li));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(nums.length, nums, output, 0);
        return output;
    }

    public void backtrack(int n, int nums[], List<List<Integer>> output, int first) {
        if(first == n) {
            output.add(Arrays.stream(nums)        // IntStream
                    .boxed()          // Stream<Integer>
                    .collect(Collectors.toList()));
        }
        for(int i=first;i<n;i++) {
            swap(nums, first, i);
            backtrack(n, nums, output, first+1);
            swap(nums, first, i);
        }
    }

    public void swap(int nums[], int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
