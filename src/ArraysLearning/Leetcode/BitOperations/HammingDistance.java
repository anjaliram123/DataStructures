package ArraysLearning.Leetcode.BitOperations;

public class HammingDistance {

    public static void main(String[] args) {

        HammingDistance hd = new HammingDistance();
        int r = hd.get(7,10);
    }

    public int get(int a, int b) {
        int res = a^b;

        int bitcount = 0;

        String s = Integer.toBinaryString(res);
        while(res != 0) {
            if((res&1) == 1) {
                bitcount = bitcount + 1;
            }
            res >>= 1;
        }



        return bitcount;
    }

}
