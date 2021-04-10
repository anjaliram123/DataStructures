package ArraysLearning.Leetcode.thirtydaychallenge;

public class ContinguousArray2 {
    public static void main(String[] args) {
        ContinguousArray2 c = new ContinguousArray2();
        int nums[] = {0,0,1,0,0,0,1,1};
        int len = c.findMaxLength(nums);
        System.out.println(len);
    }
    public int findMaxLength(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int zerolen = 0;
        int onelen = 0;
        int maxLen = 0;
        int zeros = 0;
        int ones = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                zeros = zeros + 1;
                zerolen = zerolen+1;
            } else if(nums[i] == 1) {
                ones = ones + 1;
                onelen = onelen+1;
            }
            if(zeros == ones) {
                int l = zerolen + onelen;
                maxLen= Math.max(l,maxLen);
            }
        }
        return maxLen;
    }
}
