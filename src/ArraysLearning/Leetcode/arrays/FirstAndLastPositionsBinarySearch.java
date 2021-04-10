package ArraysLearning.Leetcode.arrays;

public class FirstAndLastPositionsBinarySearch {

    public static void main(String[] args) {
        FirstAndLastPositionsBinarySearch search = new FirstAndLastPositionsBinarySearch();
        int nums [] = {5,7,8,8,10};
        int target = 8;
        int [] range = search.searchRange(nums, target);
        for(int i=0;i<range.length;i++) {
            System.out.print(" "+range[i]);
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int range[] = {-1,-1};
        int leftIndex = extremeInsertionIndex(nums,target, true);

        if(nums[leftIndex] == -1) {
            return range;
        }
        range[0] = leftIndex;
        range[1]=extremeInsertionIndex(nums,target, false)-1;
        return range;
    }

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length-1;

        while(low<high) {
            int mid = low + (high-low)/2;
            if (nums[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }

}
