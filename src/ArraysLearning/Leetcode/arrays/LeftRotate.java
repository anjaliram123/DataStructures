package ArraysLearning.Leetcode.arrays;

public class LeftRotate {

    public static void main(String[] args) {
        int nums [] = {1,2};
        int k = 3;
        RotateArray ra = new RotateArray();
        int res[] = ra.rotate(nums, k);
        for(int i=0;i<res.length;i++) {
            System.out.print(" "+res[i]);
        }
    }

    public int[] rotate(int[] nums, int k) {
        //very important if k is greater than nums.length;
        k = k%nums.length;
        int arr[] = new int[nums.length];
        int n = nums.length-1;

        for(int i=0;i<k;i++) {
            arr[n-i] = nums[k-(i+1)];
        }

        int j =0;
        for(int i=nums.length-k;i<nums.length;i++) {
            arr[j] = nums[i];
            j++;
        }

        for(int i=0;i<arr.length;i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}
