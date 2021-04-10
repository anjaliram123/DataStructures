package ArraysLearning.Leetcode.PriorityQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TopKfrequentQuickSelect {

    int[] unique;
    Map<Integer, Integer> count;

    public static void main(String[] args) {
        TopKfrequentQuickSelect top = new TopKfrequentQuickSelect();
        int nums[] = {4,5,5,2,1,1,1,5,2,3,3,5,2};
        int k = 3;
        int arr [] = top.topKFrequent(nums, 3);
        for(int i: arr) {
            System.out.println(i);
        }
    }

    public void swap(int a, int b) {
        int tmp = unique[a];
        unique[a] = unique[b];
        unique[b] = tmp;
    }

    public int partition(int left, int right) {
        int pivot = unique[right];
        int pivot_frequency = count.get(pivot);
        // 1. move pivot to end
       // swap(pivot_index, right);
        int store_index = left;

        // 2. move all less frequent elements to the left
        for (int i = left; i <= right; i++) {
            if (count.get(unique[i]) < pivot_frequency) {
                swap(store_index, i);
                store_index++;
            }
        }

        // 3. move pivot to its final place
        swap(store_index, right);

        return store_index;
    }

    public void quickselect(int left, int right, int k_smallest) {
        /*
        Sort a list within left..right till kth less frequent element
        takes its place.
        */

        // base case: the list contains only one element
        if (left == right) return;

        // select a random pivot_index
        //Random random_num = new Random();
        //int pivot_index = left + random_num.nextInt(right - left);

        // find the pivot position in a sorted list
        int partition = partition(left, right);

        // if the pivot is in its final sorted position
        if (k_smallest == partition) {
            return;
        } else if (k_smallest < partition) {
            // go left
            quickselect(left, partition - 1, k_smallest);
        } else {
            // go right
            quickselect(partition + 1, right, k_smallest);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        count = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
        }
        int n = count.size();
        unique = new int[n];
        int i = 0;
        for (int num: count.keySet()) {
            unique[i] = num;
            i++;
        }

        quickselect(0, n-1,n-k);
        return Arrays.copyOfRange(unique, n - k, n);
    }
}
