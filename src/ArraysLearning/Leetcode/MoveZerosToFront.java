package ArraysLearning.Leetcode;

public class MoveZerosToFront {

    public static void main(String[] args) {
        MoveZerosToFront m = new MoveZerosToFront();
        int nums [] = {0,1,0,12,3};
        m.move(nums);
    }

    public void move(int nums[]) {
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == 0){
                int temp = 0;
                temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}
