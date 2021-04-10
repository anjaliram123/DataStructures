package ArraysLearning.Leetcode.arrays;

public class SearchinARotatedArray {

    public static void main(String[] args) {
        SearchinARotatedArray s = new SearchinARotatedArray();
        int nums [] = {4,5,6,7,0,1,2};
        int target = 0;
        int index = s.search(nums, 0);
        System.out.println(index);
    }

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;

    }
}
