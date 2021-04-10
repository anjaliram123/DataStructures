package ArraysTutorialHorizon;

import java.util.Arrays;

public class RearrangelementsBruteForce {

    public static void main(String[] args) {

        int a[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int n = 5;
        RearrangelementsBruteForce rearrange = new RearrangelementsBruteForce();
        rearrange.rearrange(a,n);

    }

    public void rearrange(int[] nums, int n) {

        int start = 0;
        int end = nums.length -1; //9
        int mid = start + (end-start)/2; //4
        while(start < n && mid<end) {
            int leftIndex = start + 1;
            int rightIndex = mid + 1;

            while (rightIndex > leftIndex) {
                swap(nums, rightIndex, rightIndex-1);
                rightIndex--;
            }
            start += 2;
            mid += 1;
        }

        for(int i=0;i<2*n;i++) {
            System.out.print(nums[i]+" ");
        }
    }

    private void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
