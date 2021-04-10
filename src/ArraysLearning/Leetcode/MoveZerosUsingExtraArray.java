package ArraysLearning.Leetcode;

public class MoveZerosUsingExtraArray {

    public static void main(String[] args) {
        MoveZerosUsingExtraArray m = new MoveZerosUsingExtraArray();
        int nums[] = {0,1,0,12,3};
        m.move(nums);
    }

    public void move(int nums[]) {
        int b [] = new int[nums.length];
        int j = 0;
        for(int i=0;i<nums.length; i++) {
            if(nums[i] != 0) {
                b[j] = nums[i];
                j++;
            }
        }

        for(int i=0; i<b.length ; i++) {
            nums[i] = b[i];
        }
    }
}
