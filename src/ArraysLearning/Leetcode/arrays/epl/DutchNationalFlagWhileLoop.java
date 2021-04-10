package ArraysLearning.Leetcode.arrays.epl;

public class DutchNationalFlagWhileLoop {

    public static void main(String[] args) {
        DutchNationalFlagWhileLoop dw = new DutchNationalFlagWhileLoop();
        int nums [] = {2,0,2,1,1,0};
        dw.partition(nums,1);
        for(int i=0;i<nums.length;i++) {
            System.out.print(" "+nums[i]);
        }
    }

    public void partition(int nums[], int pivot) {
        int pivotValue = 1;
       //using one pass
        //divinding elements into bottom (0 to smaller)
        //mid (smaller to equal)
        //unclassified (equal to larger)
        //top(larger to nums.length size)
        int smaller = 0; int equal = 0; int larger = nums.length-1;
        while(equal <= larger){
            if(nums[equal] < pivotValue) {
                swap(nums, equal, smaller);
                equal++;
                smaller++;
            } else if (nums[equal] == pivotValue) {
                equal++;
            }else {
                swap(nums, equal, larger);
                larger--;
            }
        }
    }

    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
