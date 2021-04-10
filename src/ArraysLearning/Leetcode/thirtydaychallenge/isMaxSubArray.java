package ArraysLearning.Leetcode.thirtydaychallenge;

public class isMaxSubArray{
    public static void main(String[] args) {
        isMaxSubArray is = new isMaxSubArray();
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int val = is.maxSubArray(a);
        System.out.println(val);
    }

    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }
            if (sum > maxValue) {
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
