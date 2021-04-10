package ArraysLearning.Leetcode;

public class LeftRotateArrayByHelperArray {

    public static void main(String[] args) {
        LeftRotateArrayByHelperArray l = new LeftRotateArrayByHelperArray();
        int nums[] = {1,2};
        int k = 3;
        l.rotate(nums, k);
    }

    public void rotate (int nums[], int k) {
        k = k % nums.length;
        int a [] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            a[(i+(nums.length-k)) % nums.length] = nums[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
