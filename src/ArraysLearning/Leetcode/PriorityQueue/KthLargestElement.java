package ArraysLearning.Leetcode.PriorityQueue;

import java.util.Random;

public class KthLargestElement {

    public static void main(String[] args) {
        int arr [] = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElement le = new KthLargestElement();
        int largest = le.findKthLargest(arr, k);
        System.out.println("The Kth largest element is "+largest);
    }

    public int findKthLargest(int[] nums, int k) {
        quickSort(0, nums.length-1, nums, nums.length-k);
        return nums[nums.length-k];
    }

    public void quickSort(int low, int high , int [] nums, int k_smallest) {
        if(low < high) {
            Random r = new Random();
            int pivotIndex = low + r.nextInt(high-low);
            int p = partition(low, high, pivotIndex, nums);
            if(k_smallest == p) {
                return;
            }
            if(k_smallest < p) {
                quickSort(low, p - 1, nums, k_smallest);
            } else {
                quickSort(p + 1, high, nums, k_smallest);
            }
        }
    }

    public int partition(int low, int high, int pivotIndex, int nums[]) {
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, high);
        int i = low;
        for(int j=low;j<=high;j++) {
            if(nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
