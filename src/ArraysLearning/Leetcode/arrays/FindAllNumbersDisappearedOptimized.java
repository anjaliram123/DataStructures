package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedOptimized {

    public static void main(String[] args) {
        FindAllNumbersDisappearedOptimized f = new FindAllNumbersDisappearedOptimized();
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> res = f.findDisappearedNumbers(nums);
        res.forEach(i-> System.out.println(i));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            int newIndex = Math.abs(nums[i])-1;

            if(nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        for(int i=1;i<=nums.length;i++) {
            if(nums[i-1] > 0) {
                res.add(i);
            }
        }

        return res;
    }
}
