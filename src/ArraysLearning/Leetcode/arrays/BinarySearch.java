package ArraysLearning.Leetcode.arrays;

public class BinarySearch {

    public static void main(String[] args) {
       int [] nums = {5,7,8,8,10};
       BinarySearch bs = new BinarySearch();
        int indx = bs.binarySearch(nums, 0,nums.length-1 ,8);
        System.out.println("The indx is "+indx);
    }

    public int binarySearch (int nums[], int start, int end, int target) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
               return binarySearch(nums, start, mid - 1, target);
            } else {
               return binarySearch(nums, mid + 1, end, target);
            }
        }
        return -1;
    }



}
