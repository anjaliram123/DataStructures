package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.*;

public class ComputePermutations {

    int count  = 0;
    public static void main(String[] args) {
        int nums [] = {7,3,5};
        ComputePermutations c = new ComputePermutations();
        List<List<Integer>> res = new ArrayList<>();
         res = c.compute(nums, res);
        ListIterator<List<Integer>> itr = res.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            //System.out.println(c.count);
        }
    }

    public List<List<Integer>> compute(int nums[], List<List<Integer>>res) {
        permute(0, nums, res);
        return res;
    }

    public void permute(int i, int nums[], List<List<Integer>>res ) {
        count++;
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
            //here we ar fixing 7 and finding permutations for 3,5 - after thats done
            // we swap 3 to position of 7 which is index 0 - we fix 3 and find permutations of 7,5
            //thats why below swap is used
            swap(nums, i, j);
            permute(i+1, nums, res);
            //below swap is used to put back array to its original postion after permutations are calculated.
            swap(nums, i , j);
        }
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
