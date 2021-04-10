package ArraysLearning.Leetcode.arrays.epl;

import java.util.Collections;

public class DutchNationalFlag {

    public static void main(String[] args) {
        DutchNationalFlag df = new DutchNationalFlag();
        int nums [] = {0,1,2,0,2,1,1};
        df.partition(nums,2);
        for(int i=0;i<nums.length;i++) {
            System.out.print(" "+nums[i]);
        }
    }

    public void partition(int nums[], int pivot) {
        //first pass for having all elements lesser than pivot at start of array
        int pivotValue = nums[pivot];
        int smaller = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, smaller);
                smaller++;
            }
        }
        //second pass for having all elements greater or equal to pviot at back of array
        int larger = nums.length-1;
        for(int i=nums.length-1;i>=0 && nums[i] >= pivotValue ;i--) {
            if(nums[i] > pivotValue){
                swap(nums, i, larger);
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
