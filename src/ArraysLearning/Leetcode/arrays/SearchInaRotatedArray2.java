package ArraysLearning.Leetcode.arrays;

public class SearchInaRotatedArray2 {

    public static void main(String[] args) {
        SearchInaRotatedArray2 search = new SearchInaRotatedArray2();
        int nums[] = {1,3,1,1,1};
        int target = 3;
        boolean index = search.search(nums, target);
        System.out.println(index);
    }

    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return false;

    }
}


