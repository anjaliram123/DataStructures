package ArraysLearning.Leetcode;


//use this methd because its much faster than the  helper array method

public class RightRotateArray {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        RightRotateArray r = new RightRotateArray();
        nums = r.rotate(nums, 3);
        for(int i=0;i<nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public int[] rotate(int nums[], int k) {
        k = k % nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0,k-1, nums);
        reverse(k, nums.length-1, nums);
        return nums;
    }

    public void reverse(int start, int end, int nums[]) {
        while(start < end) {
            int temp= nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
