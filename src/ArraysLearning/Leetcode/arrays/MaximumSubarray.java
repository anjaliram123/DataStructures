package ArraysLearning.Leetcode.arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
        int res = max.maxSubArray(nums);
        System.out.println("The result is "+res);
    }

    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum+nums[i];
            if(sum == 0) {
                i = i-1;
            }
            if(sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }
}
