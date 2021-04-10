package ArraysLearning.Leetcode.arrays;

import java.util.HashMap;

public class SubArraySumEqualsKusingHashmap {

    public static void main(String[] args) {
        SubArraySumEqualsKusingHashmap s = new SubArraySumEqualsKusingHashmap();
        int nums [] = {1,2,3};
        int k = 3;
        int res = s.subarraySum(nums, k);
        System.out.println(res);
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
            {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
