package ArraysLearning.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        int nums[] = {1,2};
        int k = 3;
        RotateArray r = new RotateArray();
        r.rotateRight(nums, k);
    }

    public void rotateRight (int nums[], int k) {
        int x = 0;
        int []b = new int[nums.length];
        int l = nums.length-1;
        int startb = k;
        if(nums.length > 1) {
            while (x < k) {
                b[startb - 1] = nums[l];
                startb--;
                l--;
                x++;
            }

            int putBack = k;
            for (int i = 0; i < nums.length - k; i++) {
                b[putBack] = nums[i];
                putBack++;
            }

            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
    }
}
