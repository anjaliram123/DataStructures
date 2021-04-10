package ArraysLearning.Leetcode.thirtydaychallenge;

public class ContiguousArray {

    public static void main(String[] args) {
        ContiguousArray c = new ContiguousArray();
        int nums[] = {0,1,0,1,0,1,1,0,1,0,1};
        int len = c.findMaxLength(nums);
        System.out.println(len); }
    public int findMaxLength(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int len = 0;
        int maxLen = 0;
        int zeros = 0;
        int ones = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                zeros = zeros + 1;
            } else if(nums[i] == 1) {
                ones = ones + 1;
            }
            if(zeros == ones) {
                len = len + 2;
                maxLen= Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}
