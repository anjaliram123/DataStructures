package ArraysLearning.Leetcode.arrays.epl;

public class EvenNumbersFront {

    public static void main(String[] args) {
        EvenNumbersFront e = new EvenNumbersFront();
        int nums [] = {2,3,7,9,10,4,5,13};
        int res [] = e.evenOddConstantSpace(nums);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }

    }

    // o(n) space
    public int[] evenOdd(int nums[]) {
        int res [] = new int[nums.length];
        int j = 0;
        for(int i=0;i<nums.length;i++)  {
            if(nums[i] % 2 == 0) {
                res[j] = nums[i];
            }
            j++;
        }

        for(int i=0;i<nums.length;i++)  {
            if(nums[i] % 2 != 0) {
                res[j] = nums[i];
            }
            j++;
        }

        return res;
    }

    //o(1)space
    public int[] evenOddConstantSpace(int nums[]) {
        int nextEven = 0;
        int nextOdd = nums.length-1;
        while(nextEven < nextOdd) {
            if(nums[nextEven] % 2  == 0) {
                nextEven++;
            } else {
                int temp = nums[nextEven];
                nums[nextEven] = nums[nextOdd];
                nums[nextOdd]  = temp;
                nextOdd--;
            }
        }
        return nums;
    }

}
