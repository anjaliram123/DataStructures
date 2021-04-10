package ArraysLearning.Leetcode.BitOperations;

public class Numberof1s {

    public static void main(String[] args) {
        Numberof1s numberof1s = new Numberof1s();
        System.out.println(numberof1s.getones(8));
    }

    public int getones (int num) {
        String s = Integer.toBinaryString(num);
        System.out.println(s);
        int count = 0;
        while(num > 0) {
            if((num&1) == 1){
                count = count +1;
            }
            num >>= 1;
        }
        return count;
    }
}
