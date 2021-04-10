package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstandLastPositioninArray {

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        FirstandLastPositioninArray bs = new FirstandLastPositioninArray();
        int res[] = bs.arr(nums, 0,nums.length-1 ,8);
        for(int i:res) {
            System.out.print(" "+i);
        }

    }

    public int[] arr(int nums[], int start, int end, int target) {
        if(target == 0) {
            return new int[]{-1,-1};
        }
        int indx = binarySearch(nums, 0,nums.length-1 ,8);
        if(indx == -1) {
            return new int[]{-1,-1};
        }
        List<Integer> li = new ArrayList<>();
        if(indx-1 >= 0) {
            if(nums[indx-1] == target){
                for(int i = indx;i>=0;i--) {
                    if(nums[i] == target) {
                        li.add(i);
                    }
                }
            }
        } else if(indx + 1 <= nums.length-1){
            if(nums[indx+1] == target){
                for(int i = indx;i<=nums.length-1;i++) {
                    if(nums[i] == target) {
                        li.add(i);
                    }
                }
            }
        }
        int res [] = new int[li.size()];
        for(int i = 0; i < li.size(); i++) {
            res[i] = li.get(i);
        }
        return res;
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

    //o(n)
    public int[] searchRange(int[] nums, int target) {
        int  range [] = {-1,-1};
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target){
                range[0]=i;
            }
        }

        if(range[0]==-1) {
            return range;
        }

        for(int j=nums.length-1;j>=0;j--) {
            if(nums[j]==target){
                range[1]=j;
            }
        }
        return range;
    }
}
