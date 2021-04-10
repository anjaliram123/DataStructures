package ArraysLearning.Leetcode.arrays;

public class Productexceptitself {

    public static void main(String[] args) {
        Productexceptitself p = new Productexceptitself();
        int nums [] = {1,2,3,4};
        int res [] = p.productExceptSelf(nums);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1) {
            return new int [] {nums[0]};
        }

        int length = nums.length;
        int L [] = new int[nums.length];
        int R [] = new int[nums.length];
        int ans[] = new int[length];

        L[0] = 1;

        for(int i=1;i<L.length;i++) {
            L[i] = L[i-1] * nums[i-1];
        }

        R[length-1] = 1;
        for(int i=length-2; i>=0; i--) {
            R[i] = R[i+1] * nums[i+1];
        }

        for(int i=0;i<length;i++) {
            ans[i] = L[i]*R[i];
        }

        return ans;

    }
}
