package ArraysLearning.Leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIfInputArrayIsSorted {

    public static void main(String[] args) {
        TwoSumIfInputArrayIsSorted t = new TwoSumIfInputArrayIsSorted();
        int numbers [] = {2,7,11,15};
        int target = 9;
        int [] res = t.twoSum(numbers, target);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }

    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++) {
            int compliment = target - numbers[i];
            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment)+1, i+1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return new int[] {0};
    }
}
