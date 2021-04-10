package ArraysLearning.Leetcode;

public class MoveZerosInplace {

    public static void main(String[] args) {
        MoveZerosInplace m = new MoveZerosInplace();
        int nums [] = {0,1,0,12,3};
        //result - {1,12,3,0,0}
        m.move(nums);
    }

    public void move(int nums[] ) {
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        //fill remainign with zeros
        for(int i=j ; i<nums.length; i++) {
            nums[i] = 0;
        }

        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}
