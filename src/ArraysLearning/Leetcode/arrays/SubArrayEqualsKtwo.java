package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayEqualsKtwo {

    public static void main(String[] args) {
        SubArrayEqualsKtwo sub = new SubArrayEqualsKtwo();
        int nums [] = {28,54,7,-70,22,65,-6};
        int k = 100;
        int res = sub.subarraySum(nums, k);
        System.out.println(res);
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == k) {
                count += 1;
            }
            int sum = nums[i];
            for(int j = i+1;j<nums.length;j++) {
                sum = sum + nums[j];
                if(sum == k) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
