package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        SubarraySumEqualsK sub = new SubarraySumEqualsK();
        int nums [] = {28,54,7,-70,22,65,-6};
        int k = 100;
        int res = sub.subarraySum(nums, k);
        System.out.println(res);
    }

    public int subarraySum(int[] nums, int k) {
        List<int[]> subArraySet = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == k) {
                subArraySet.add(new int [] {nums[i]});
                continue;
            }
            int sum = nums[i];
            for(int j = i+1;j<nums.length;j++) {
                sum = sum + nums[j];
                if(sum == k) {
                    int start = i;
                    int arr [] = new int[(j-i)+1];
                    int p = 0;
                    while(start <= j){
                        arr[p] = nums[start];
                        start++;
                        p++;
                    }
                    subArraySet.add(arr);
                }
            }
        }

        return subArraySet.size();
    }
}
