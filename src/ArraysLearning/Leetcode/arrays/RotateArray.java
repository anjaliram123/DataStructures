package ArraysLearning.Leetcode.arrays;

public class RotateArray {

    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        int k = 11;
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
        int track = 0;
        for(int i=0;i<k;i++) {
            arr[k-(i+1)] = nums[n-i];
            track++;
        }

        for(int i=0;i<=n-k;i++) {
            arr[track] = nums[i];
            track++;
        }

        for(int i=0;i<arr.length;i++) {
            nums[i] = arr[i];
        }
        return nums;
    }


}
