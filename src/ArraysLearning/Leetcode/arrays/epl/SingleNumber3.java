package ArraysLearning.Leetcode.arrays.epl;

public class SingleNumber3 {

    public static void main(String[] args) {
        SingleNumber3 s = new SingleNumber3();
        int nums []  = {1,2,1,3,2,5};
        int res [] = s.singleNumber(nums);
        for(int i : res) {
            System.out.println(i);
        }
    }

    public int[] singleNumber(int[] nums) {
        int result[] = new int[2];
        int xor = 0;
        for(int n: nums) {
            xor = xor ^ n;
        }
        //fing the right most set bit or last set bit
        xor = xor & ~(xor-1);

        //group the numbers with bit set and bit unset
        for(int n : nums) {
            if((n & xor) == 0) {
                result[0] ^= n;
            } else {
                result[1] ^= n;
            }
        }
        return result;
    }
}
