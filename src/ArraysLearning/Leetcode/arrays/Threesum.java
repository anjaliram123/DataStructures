package ArraysLearning.Leetcode.arrays;

import java.util.*;

public class Threesum {

    public static void main(String[] args) {
        Threesum three = new Threesum();
        int nums [] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = three.threeSum(nums);
        res.forEach(resList -> resList.forEach(System.out::println));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null ){
            return null;
        }
        if(nums.length == 1) {
            return new ArrayList<>();
        }
        Set<List<Integer>> res = new HashSet<>();
        Map<Integer, Integer> maps = new HashMap<>();
        Set<Integer> dups = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; j++) {
                    int compliment = -nums[i] - nums[j];
                    if (maps.containsKey(compliment) && maps.get(compliment) == i) {
                        List<Integer> pf = Arrays.asList(nums[i], nums[j], compliment);
                        Collections.sort(pf);
                        res.add(pf);
                    } else {
                        maps.put(nums[j], i);
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }
}
