package ArraysLearning.Leetcode.arrays.epl;

public class SingleNumberK {

    public static void main(String[] args) {
        SingleNumberK k = new SingleNumberK();
        int nums []= {3,5,5,3,3,7,3,3,5,5,5,8};
        k.singleNumber(nums);
       // System.out.println(res);
    }
    public void singleNumber(int[] nums) {
        int seenOnce = 0; int seenTwice = 0; int seenThrice = 0; int seenQuad = 0;
        for(int n : nums) {
            seenOnce = ~seenTwice & ~seenThrice & ~seenQuad & (seenOnce ^ n);
            seenTwice = ~seenOnce & ~seenThrice & ~seenQuad & (seenTwice ^ n);
            seenThrice = ~seenOnce & ~seenTwice & ~seenQuad & (seenThrice ^ n);
            seenQuad = ~seenOnce & ~seenTwice & ~seenThrice & (seenQuad ^ n);
        }
        System.out.println(seenOnce);
    }

}
