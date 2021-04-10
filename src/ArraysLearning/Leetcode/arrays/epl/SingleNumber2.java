package ArraysLearning.Leetcode.arrays.epl;

public class SingleNumber2 {

    public static void main(String[] args) {
        SingleNumber2 s = new SingleNumber2();
        int nums[] = {2,2,3,2};
        int res = s.singleNumber(nums);
        System.out.println(res);
    }

    public int singleNumber(int[] nums) {
        int seenOnce = 0, seenTwice = 0;

        int x = ~seenOnce;
        int y = ~seenTwice;

        for (int num : nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }
}
