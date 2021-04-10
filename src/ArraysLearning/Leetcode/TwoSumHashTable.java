package ArraysLearning.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashTable {

    public static void main(String[] args) {
        TwoSumHashTable t = new TwoSumHashTable();
        int nums[] = {2,11,5,7};
        int target = 9;
        int res[] = t.get(nums, target);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public int[] get(int nums[], int target ) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(m.containsKey(complement)) {
                return new int[] {m.get(complement), i};
            } else {
                m.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
