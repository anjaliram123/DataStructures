package ArraysLearning.Leetcode.arrays.epl;

public class DeleteDuplicatesFromSortedArray {

    public static void main(String[] args) {
        DeleteDuplicatesFromSortedArray d = new DeleteDuplicatesFromSortedArray();
        int nums [] = {1,1,2};
        int res  = d.removeOptimized(nums);
        System.out.println(res);
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;
        while(i<nums.length && j<nums.length){
            if(nums[i] == nums[j]) {
                nums[j] = Integer.MIN_VALUE;
                j=j+1;
            } else {
                i = j;
                j= j+1;
            }
        }

        for(int n : nums) {
            if(n != Integer.MIN_VALUE) {
                count++;
            }
        }
        return count;
    }

    public int removeOptimized(int[] nums) {
        int i = 0;
        if(nums.length> 1) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
        }
        return i+1;
    }
}
