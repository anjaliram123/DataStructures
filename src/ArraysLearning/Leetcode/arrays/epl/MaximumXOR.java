package ArraysLearning.Leetcode.arrays.epl;

public class MaximumXOR {

    public static void main(String[] args) {
        MaximumXOR max = new MaximumXOR();
        int nums [] = {14,70,53,83,49,91,36,80,92,51,66,70};
        int maxxor = max.findMaximumXOR(nums);
        System.out.println("Maximum xor is "+maxxor);
    }

    public int findMaximumXOR(int[] nums) {
        int maxXOR = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=1;j<nums.length;j++) {
                int xor = nums[i];
                xor = xor ^ nums[j];
                if(xor > maxXOR) {
                    maxXOR = xor;
                }
            }
        }
        return maxXOR;
    }
}
